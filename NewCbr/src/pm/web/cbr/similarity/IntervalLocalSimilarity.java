package pm.web.cbr.similarity;

import jcolibri.datatypes.Instance;
import jcolibri.exception.NoApplicableSimilarityFunctionException;
import jcolibri.method.retrieve.NNretrieval.similarity.LocalSimilarityFunction;
import pm.web.cbr.DescriptionQuery;

/**
 * Локальная интервальная мера сходства.
 * @author Mikhail Navrotskiy
 * @version 1.0
 */
@Deprecated
public class IntervalLocalSimilarity implements LocalSimilarityFunction {

    /**
     * Метод сравнения прецедентов.
     * @param caseObject Прецедент из бд.
     * @param queryObject Запрос.
     * @return Результат сравнения.
     * @throws NoApplicableSimilarityFunctionException
     */
    @Override
    public double compute(Object caseObject, Object queryObject) throws NoApplicableSimilarityFunctionException {

        if ((caseObject == null) || (queryObject == null))
            return 0;
        if (!(caseObject instanceof Instance))
            throw new jcolibri.exception.NoApplicableSimilarityFunctionException(this.getClass(), caseObject.getClass());
        if (!(queryObject instanceof DescriptionQuery))
            throw new jcolibri.exception.NoApplicableSimilarityFunctionException(this.getClass(), queryObject.getClass());

        Instance c = (Instance) caseObject;
        DescriptionQuery query = (DescriptionQuery) queryObject;

        return 0;
    }

    /**
     * Метод проверки корректности запросов.
     * @param caseObject Объект прецедента из БД.
     * @param queryObject Объект запроса.
     * @return Факт корректности параметров.
     */
    @Override
    public boolean isApplicable(Object caseObject, Object queryObject) {

        if ((caseObject == null) && (queryObject == null))
            return true;
        else if (caseObject == null)
            return queryObject instanceof DescriptionQuery;
        else if (queryObject == null)
            return caseObject instanceof Instance;
        else
            return (caseObject instanceof Instance) && (queryObject instanceof Instance);
    }
}
