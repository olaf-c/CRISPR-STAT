import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NewDataEntry {

    BufferedReader reader = null;
    FileWriter writer = null;

        try
    {
        reader = new BufferedReader(new FileReader(DataSet));
        String line = reader.readLine();

        while (line!=null)
        {
            oldContent = oldContent + line + System.lineSeparator();
            line = reader.readLine();
        }

    }
        catch (
    IOException e)
    {
        e.printStackTrace();
    }
        finally
    {
        try
        {
            reader.close();
            writer.close();
        }
        catch (IOException e)
        {
            modifyFile("C:/StudentFile")
        }
    }

}
