
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JButton;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class ControladorVotaciones extends Controlador{
    
    private VistaVotaciones vista;
    private ModeloVotacion modelo;
    public ControladorVotaciones(Modelo modelo, Vista vista) {
        super(modelo, vista);
        this.vista=(VistaVotaciones) vista;
        this.modelo=(ModeloVotacion) modelo;
        
        
        this.vista.getBtnGraficaBarras().addActionListener(this);
        this.vista.getBtnGraficaPastel().addActionListener(this);
        this.vista.getCandidato1().addActionListener(this);
        this.vista.getCandidato2().addActionListener(this);
        this.vista.getCandidato3().addActionListener(this);
         
        //TODO Auto-generated constructor stub
    }
        
    public void actualizar (){
        
    }
    
    public void tratarEvento(){
        
    }
    
    public void getFrame(){
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(vista.getBtnGraficaBarras()==e.getSource()){
            JFrame frame = new JFrame ("Gráfica de barras - Votaciones"); 
            frame.setSize(700, 450); 
   
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.addValue(modelo.getCandidato1(), "Candidato 1", "Candidatos");
            dataset.addValue(modelo.getCandidato2(), "Candidato 2", "Candidatos");
            dataset.addValue(modelo.getCandidato3(), "Candidato 3", "Candidatos");

            JFreeChart chart = ChartFactory.createBarChart("Gráfica de barras - Votaciones","Candidatos", "Votos", dataset,PlotOrientation.VERTICAL, true, true,true);
            ChartPanel chartPanel = new ChartPanel(chart, false);
            frame.setContentPane(chartPanel);
            
        }
        
        if(vista.getBtnGraficaPastel()==e.getSource()){
            JFrame frame = new JFrame ("Gráfica de pastel - Votaciones"); 
            frame.setSize(700, 450); 
   

            DefaultPieDataset data = new DefaultPieDataset();
            data.setValue("Candidato 1", modelo.getCandidato1());
            data.setValue("Candidato 2", modelo.getCandidato2());
            data.setValue("Candidato 3", modelo.getCandidato3());

            JFreeChart barras = ChartFactory.createPieChart("Gráfica de pastel - Votaciones",data,true, true,false);
            ChartPanel chartPanel = new ChartPanel(barras, false);
            frame.setContentPane(chartPanel);
           
        }
        
        if(vista.getCandidato1()==e.getSource()){
            modelo.setCandidato1();
            String numero = String.valueOf(modelo.getCandidato1()); 
            vista.getCandidato1().setText(numero); 
        }
        
        if(vista.getCandidato2()==e.getSource()){
            modelo.setCandidato2();
            String numero = String.valueOf(modelo.getCandidato2()); 
            vista.getCandidato2().setText(numero); 
        }
        
        if(vista.getCandidato3()==e.getSource()){
            modelo.setCandidato3();
            String numero = String.valueOf(modelo.getCandidato3()); 
            vista.getCandidato3().setText(numero); 
        }
        
    }

    
}
