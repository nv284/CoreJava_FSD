package com.sim.set;

import java.time.LocalDate;
import java.util.Objects;
import java.util.TreeSet;

//This class will represent a health issue with attributes like `id`, `description`, `severity`, and `dateReported`. It will implement the `Comparable` interface to ensure health issues are sorted by 
//severity.
class HealthIssue implements Comparable<HealthIssue>{
    private int id;
    private String description;
    private int severity; // Severity from 1 (least severe) to 10 (most severe)
    private LocalDate dateReported;

    public HealthIssue(int id, String description, int severity, LocalDate dateReported) {
        this.id = id;
        this.description = description;
        this.severity = severity;
        this.dateReported = dateReported;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getSeverity() {
        return severity;
    }

    public LocalDate getDateReported() {
        return dateReported;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HealthIssue that = (HealthIssue) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int compareTo(HealthIssue other) {
        return Integer.compare(this.severity, other.severity);
    }

    @Override
    public String toString() {
        return "HealthIssue{id=" + id + ", description='" + description + "', severity=" + severity + ", dateReported=" + dateReported + "}";
    }
}

//This class will manage the health issues using a `TreeSet`.
class HealthIssueManager{
	TreeSet<HealthIssue> healthIssues = new TreeSet<>();
	
	  public void addHealthIssue(HealthIssue healthIssue) {
	        if (healthIssues.add(healthIssue)) {
	            System.out.println("Health issue added: " + healthIssue);
	        } else {
	            System.out.println("Health issue already exists: " + healthIssue);
	        }
	    }

	    public void removeHealthIssue(int id) {
	        HealthIssue issueToRemove = null;
	        for (HealthIssue issue : healthIssues) {
	            if (issue.getId() == id) {
	                issueToRemove = issue;
	                break;
	            }
	        }

	        if (issueToRemove != null) {
	            healthIssues.remove(issueToRemove);
	            System.out.println("Health issue removed: " + issueToRemove);
	        } else {
	            System.out.println("Health issue not found");
	        }
	    }
	    public HealthIssue findHealthIssueById(int id) {
	        for (HealthIssue issue : healthIssues) {
	            if (issue.getId() == id) {
	                return issue;
	            }
	        }
	        return null;
	    }

	    public void displayHealthIssues() {
	        for (HealthIssue issue : healthIssues) {
	            System.out.println(issue);
	        }
	    }

}

//here's how you can use the `HealthIssueManager` class to manage health issues:

public class TreeSetProject {
	   public static void main(String[] args) {
	        // Create the health issue manager
	        HealthIssueManager manager = new HealthIssueManager();

	        // Add some health issues
	        manager.addHealthIssue(new HealthIssue(1, "Common cold", 2, LocalDate.of(2024, 1, 15)));
	        manager.addHealthIssue(new HealthIssue(2, "Flu", 5, LocalDate.of(2024, 2, 10)));
	        manager.addHealthIssue(new HealthIssue(3, "Broken leg", 7, LocalDate.of(2024, 3, 5)));
	        manager.addHealthIssue(new HealthIssue(4, "Heart attack", 10, LocalDate.of(2024, 4, 20)));

	        // Display all health issues
	        System.out.println("Displaying all health issues:");
	        manager.displayHealthIssues();

	        // Find a health issue by ID
	        System.out.println("\nFinding health issue with ID 2:");
	        HealthIssue foundIssue = manager.findHealthIssueById(2);
	        if (foundIssue != null) {
	            System.out.println(foundIssue);
	        } else {
	            System.out.println("Health issue not found");
	        }

	        // Remove a health issue by ID
	        System.out.println("\nRemoving health issue with ID 1:");
	        manager.removeHealthIssue(1);

	        // Display all health issues after removal
	        System.out.println("\nDisplaying all health issues after removal:");
	        manager.displayHealthIssues();
	    }
}
