package solutiontreecreator.data;

import java.util.ArrayList;
import java.util.List;

import org.graphstream.graph.Node;

/**
 * 
 * This class represents a node in a solution tree. It contains a solution and information on parent and children nodes. 
 * 
 * @author Terence Qu
 * 
 */
public class SolutionNode {

	public Solution solution;
	public SolutionNode parent;
	public List<SolutionNode> children;
	
	public SolutionNode() {
		children = new ArrayList<SolutionNode>();
	}

	public void addChild(SolutionNode solutionNode) {
		this.children.add(solutionNode);
		solutionNode.parent = this;
	}

	public SolutionNode getChild(int i) {
		return children.get(i);
	}

	/**
	 * String representation of this node.
	 * @return
	 */
	public String stringRepresentation() {
		try {
			return solution.stringData();
		} catch (NullPointerException e) {
			return "root";
		}
	}
	
	/**
	 * Check if a task is already in the solution
	 */
	public boolean isTaskInSolution(Node node) {
		for(Processor timeline: solution.getProcessors()) {
			if(timeline.mapOfTasksAndStartTimes.containsKey(timeline)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Prints the tree in a console form, for debugging purposes.
	 * @param indent
	 * @param last
	 */
	public void printPretty(String indent, boolean last) {
		System.out.print(indent);
		if (last)
		{
			System.out.print("\\-");
			indent += "  ";
		}
		else
		{
			System.out.print("|-");
			indent += "| ";
		}

		System.out.println(this.stringRepresentation());

		for (int i = 0; i < children.size(); i++) {
			children.get(i).printPretty(indent, i == children.size() - 1);
		}
	}

	
	/**
	 * Returns true when this solution is complete.
	 */
	public boolean isSolutionComplete() {
		if(solution.getTasksLeft().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
