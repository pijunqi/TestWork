package com.test.word.jacob文档转PDF_图片转PDF;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

/**
 * @program: TestWork
 * @description: 文档转PDF， 图片转PDF
 * 测试未成功 在原本的文档里加了一段话 后来转用poi了 毕竟以前听老师讲过
 * @author: pijunqi
 * @create: 2019-12-20 16:20
 **/

public class jacobTest {
    String strDir = "F:\\";
    String strInputDoc = strDir + "fileIn.doc";
    String strOutputDoc = strDir + "fileOut.doc";
    String strOldText = "oldText";
    String strNewText = "It's very good to use java control Word";
    boolean isVisible = true;
    boolean isSaveOnExit = true;
    public  jacobTest(){
        ActiveXComponent oWord = new ActiveXComponent("Word.Application");
        oWord.setProperty("Visible", new Variant(isVisible));
        Dispatch oDocuments = oWord.getProperty("Documents").toDispatch();
        Dispatch oDocument = Dispatch.call(oDocuments, "Open", strInputDoc).toDispatch();
        Dispatch oSelection = oWord.getProperty("Selection").toDispatch();
        Dispatch oFind = oWord.call(oSelection, "Find").toDispatch();
        Dispatch.put(oFind, "Text", strOldText);
        Dispatch.call(oFind, "Execute");
        Dispatch.put(oSelection, "Text", strNewText);
        Dispatch.call(oSelection, "MoveDown");
        Dispatch.put(oSelection, "Text", "nSo we got the next line including BR.n");
        Dispatch oFont = Dispatch.get(oSelection, "Font").toDispatch();
        Dispatch.put(oFont, "Bold", "1");
        Dispatch.put(oFont, "Italic", "1");
        Dispatch.put(oFont, "Underline", "0");
        Dispatch oAlign = Dispatch.get(oSelection, "ParagraphFormat").toDispatch();
        Dispatch.put(oAlign, "Alignment", "3");
        Dispatch oWordBasic = (Dispatch)Dispatch.call(oWord, "WordBasic").getDispatch();
        Dispatch.call(oWordBasic, "FileSaveAs", strOutputDoc);
        Dispatch.call(oDocument, "Close", new Variant(isSaveOnExit));
        oWord.invoke("Quit", new Variant(0));
    }
    public static void main(String[] args){
        new jacobTest();
        System.out.println("Done");
    }

}
