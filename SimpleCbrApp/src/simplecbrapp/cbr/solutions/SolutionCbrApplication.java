package simplecbrapp.cbr.solutions;

import java.util.Collection;
import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.connector.OntologyConnector;
import jcolibri.exception.ExecutionException;
import jcolibri.method.retrieve.RetrievalResult;

/**
 * Класс CBR приложения для поиска рекомендаций.
 * @author M. Navrotskiy
 * @version 1.0
 */
public class SolutionCbrApplication implements StandardCBRApplication {

    /* Поля класса. */
    /** Запрос в базу прецедентов. */
    private CBRQuery query;
    /** Результат работы CBR. */
    private Collection<RetrievalResult> eval;
    /** База прецедентов. */
    private CBRCaseBase caseBase;
    /** Множество близкий прецедентов. */
    private Collection<CBRCase> selectedCase;
    /** Соединение с онтологией. */
    private OntologyConnector connector;
    /** Объект класса. */
    private SolutionCbrApplication app;
    /** Ближайший прецедент. */
    private CBRCase result;
    
    @Override
    public void configure() throws ExecutionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CBRCaseBase preCycle() throws ExecutionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cycle(CBRQuery query) throws ExecutionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postCycle() throws ExecutionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
