import de.uni_koeln.spinfo.arc.utils.TSVReader;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Andreas on 19.08.2015.
 */
public class TSVReader_Test {

    @Test
    public void readSutsilvanTSV_Test() throws IOException {
        TSVReader reader = new TSVReader();
        reader.readTSV(reader.input_data_path+"data_st.tab");
        reader.toDictTxtFile(reader.output_data_path, "sutsilvan_new");
        reader.printEntryMap(reader.output_data_path, "sutsilvan_condensed_new");
        reader.posStats(reader.output_data_path,"sutsilvan_pos_new");

    }

    @Test
    public void readSurmiranTSV_Test() throws IOException {
        TSVReader reader = new TSVReader();
        reader.readTSV(reader.input_data_path+"27-05-22_data_sm_ohne_Verben.tab");
        reader.toDictTxtFile(reader.output_data_path, "surmiran_new");
        reader.printEntryMap(reader.output_data_path, "surmiran_condensed_new");
        reader.posStats(reader.output_data_path,"surmiran_pos_new");

    }
}
