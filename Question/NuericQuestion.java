public class NuericQuestion extends Question
{
    private double answer;
    public void setAnswer(double correctResponse)
    {
        this.answer = correctResponse;
    }
    
    public boolean checkAnswer(String response)
    {
        double responseasDouble = Double.parseDouble(response);
        return Math.abs(responseasDouble - answer) <= 0.01;
    }
}