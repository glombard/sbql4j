package pl.wcislo.sbql4j.javac.test.closeby;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import pl.wcislo.sbql4j.java.test.*;
import pl.wcislo.sbql4j.java.test.model.*;

public class CloseByTest {
    
    public static void main(String[] args) {
        new CloseByTest();
    }
    
    public CloseByTest() {
        super();
        Czesc c = CloseByBOMTest.prepareData();
        List<Czesc> cList = new ArrayList();
        cList.add(c);
        List<Czesc> res = new CloseByTest_SbqlQuery0(cList).executeQuery();
        System.out.println(res);
    }
}