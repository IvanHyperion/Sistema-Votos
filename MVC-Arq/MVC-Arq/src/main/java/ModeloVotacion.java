
public class ModeloVotacion extends Modelo{
    private int candidato1=0;
    private int candidato2=0;
    private int candidato3=0;
    
    public void actualizarVotos(int info){
        
    }
    
    public void setCandidato1(){
        candidato1++;
    }
    
    public void setCandidato2(){
        candidato2++;
    }
    
    public void setCandidato3(){
        candidato3++;
    }
    
    public int getCandidato1(){
        return candidato1;
    }
    
    public int getCandidato2(){
        return candidato2;
    }
    
    public int getCandidato3(){
        return candidato3;
    }

    
}
