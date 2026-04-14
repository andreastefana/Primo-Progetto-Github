package it.unibs.ricerca_operativa;
import com.gurobi.gurobi.*;
public class Main {
    public static void main(String[] args) throws GRBException{

        GRBEnv env = new GRBEnv("Banca online");
        env.set(GRB.DoubleParam.TimeLimit, 100);
        env.set(GRB.IntParam.Presolve, 0);

        GRBModel model = new GRBModel(env);
        GRBLinExpr lin1 = new GRBLinExpr();


        System.out.println("");
    }
}
