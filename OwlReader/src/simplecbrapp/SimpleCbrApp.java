package simplecbrapp;

import simplecbrapp.cbr.problems.ProblemCbrApplication;
import simplecbrapp.cbr.solutions.SolutionCbrApplication;

/**
 * Простое cbr приложения для построения основы взаимодействия Rails и Java.
 * @author M. Navrotskiy.
 * @version 1.0
 */
public class SimpleCbrApp {

    /**
     * Главная функция приложения.
     * @param args Аргументы коммандной строки.
     */
    public static void main(String[] args) {
        
        ProblemCbrApplication.doAnalise(args);
        SolutionCbrApplication.doAnalise(args[4]);
    }
    
}
