package SWE_MVP;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import model.Model;


public class Presenter implements ActionListener{
    
    private Model model;
    private View view;

    public Presenter(View view){
        this.model = new Model();
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        view.setText(model.changeAusgabe());
    }

    public interface View{
        void setText(String s);
    }

}
