public class FillInQuestion
{
    //override the setText method to extract the answer from the question text
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String snwer = parser.next();
        
        super.setText(question);
        super.setAnswer(answer);
    }

