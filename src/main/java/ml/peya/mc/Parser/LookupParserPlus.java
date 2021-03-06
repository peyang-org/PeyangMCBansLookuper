package ml.peya.mc.Parser;

import java.util.ArrayList;

public class LookupParserPlus extends LookupParser
{
    public LookupParserPlus.STATUS RESULT;
    public int total = 0;
    public double reputation = 3.0;
    public ArrayList<String> local = new ArrayList<>();
    public ArrayList<String> global = new ArrayList<>();
    public ArrayList<String> other = new ArrayList<>();
    public int pid = 0;
    public String uuid = "";
    public String player = "";
    public double executionTime = 0.0;
    public enum STATUS
    {
        OK,
        PLAYERNOTFOUND,
        APIKEYNOTFOUND,
        UNKNOWNERROR,
        I_AM_A_TEAPOT,
        UNKNOWNHOST
    };
}