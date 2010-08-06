package registry;

import java.util.HashMap;
import java.util.HashSet;

import nlp.*;
import ui.*;
import ui.authormap.AuthorTopicVizUI;
import ui.authormap.data.UserConversationMap;
import ui.authormap.viz.AuthorTopicViz;
import ui.treemap.MainUI;
import ui.treemap.viz.TreeMap;
import util.ProgressBarFrame;

public class ComponentRegistry {
	public static MainUI registeredMainUI;
	public static TreeMap registeredTreeMap;
	public static AuthorTopicViz registeredAuthorTopicViz;
	public static AuthorTopicVizUI registeredAuthorTopicVizUI;
	
	//NLP
	public static TopicTFIDFHandlerMap registeredTopicTFIDFHandler;
	public static TFIDFHandler registeredTFIDFHandler;
	public static HashMap<String,UserConversationMap> registeredUserMatrix;
	public static GlobalTagSet registeredGlobalTagSet;
	public static HashSet<String>registeredStopWordSet;
	
	public static ProgressBarFrame registeredProgressBarFrame=new ProgressBarFrame("Please wait...");
	
	//do not instantiate
	private ComponentRegistry(){
		
	}
}
