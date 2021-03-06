package test;

import main.graph.GraphTools;
import main.graph.TaskGraph;
import org.junit.Test;
import solutionfinder.AStarParallelSolutionFinder;
import solutionfinder.data.Solution;

import static org.junit.Assert.assertEquals;

public class TestAStarSearchParallel2Processors {

    @Test
    public void test07Nodes(){
        // Parse input file
        String path = getClass().getClassLoader().getResource("graphfiles/Nodes_7_OutTree.dot").getPath();
        System.out.println(path);
        TaskGraph taskGraph = GraphTools.parseInputFile(new TaskGraph("1"), path);
        taskGraph.setUpBottomLevels();

        System.out.println("---------------------------------");

        AStarParallelSolutionFinder solutionTreeCreator = new AStarParallelSolutionFinder(2, taskGraph, 1);
        Solution optimalSolution = solutionTreeCreator.startOptimalSearch();
        optimalSolution.printData();
        assertEquals(optimalSolution.getTotalTime(), 28.0f, 0.0f);
    }

    @Test
    public void test08Nodes(){
        // Parse input file
        String path = getClass().getClassLoader().getResource("graphfiles/Nodes_8_Random.dot").getPath();
        System.out.println(path);
        TaskGraph taskGraph = GraphTools.parseInputFile(new TaskGraph("1"), path);
        taskGraph.setUpBottomLevels();

        System.out.println("---------------------------------");

        AStarParallelSolutionFinder solutionTreeCreator = new AStarParallelSolutionFinder(2, taskGraph, 2);
        Solution optimalSolution = solutionTreeCreator.startOptimalSearch();
        optimalSolution.printData();
        assertEquals(optimalSolution.getTotalTime(), 581.0f, 0.0f);
    }

    @Test
    public void test09Nodes(){
        // Parse input file
        String path = getClass().getClassLoader().getResource("graphfiles/Nodes_9_SeriesParallel.dot").getPath();
        System.out.println(path);
        TaskGraph taskGraph = GraphTools.parseInputFile(new TaskGraph("1"), path);
        taskGraph.setUpBottomLevels();

        System.out.println("---------------------------------");

        AStarParallelSolutionFinder solutionTreeCreator = new AStarParallelSolutionFinder(2, taskGraph, 2);
        Solution optimalSolution = solutionTreeCreator.startOptimalSearch();
        optimalSolution.printData();
        assertEquals(optimalSolution.getTotalTime(), 55.0f, 0.0f);
    }

    @Test
    public void test10Nodes(){
        // Parse input file
        String path = getClass().getClassLoader().getResource("graphfiles/Nodes_10_Random.dot").getPath();
        System.out.println(path);
        TaskGraph taskGraph = GraphTools.parseInputFile(new TaskGraph("1"), path);
        taskGraph.setUpBottomLevels();

        System.out.println("---------------------------------");

        AStarParallelSolutionFinder solutionTreeCreator = new AStarParallelSolutionFinder(2, taskGraph, 2);
        Solution optimalSolution = solutionTreeCreator.startOptimalSearch();
        optimalSolution.printData();
        assertEquals(optimalSolution.getTotalTime(), 50.0f, 0.0f);
    }

    @Test
    public void test11Nodes(){
        // Parse input file
        String path = getClass().getClassLoader().getResource("graphfiles/Nodes_11_OutTree.dot").getPath();
        System.out.println(path);
        TaskGraph taskGraph = GraphTools.parseInputFile(new TaskGraph("1"), path);
        taskGraph.setUpBottomLevels();

        System.out.println("---------------------------------");

        AStarParallelSolutionFinder solutionTreeCreator = new AStarParallelSolutionFinder(2, taskGraph, 2);
        Solution optimalSolution = solutionTreeCreator.startOptimalSearch();
        optimalSolution.printData();
        assertEquals(optimalSolution.getTotalTime(), 350.0f, 0.0f);
    }
}
