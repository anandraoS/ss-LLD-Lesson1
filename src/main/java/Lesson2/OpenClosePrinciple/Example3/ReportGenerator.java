package Lesson2.OpenClosePrinciple.Example3;


public class ReportGenerator {
    public String generateReport(String reportType) {
        if (reportType.equals("PDF")) {
            return "PDF report is generated";
        } else if (reportType.equals("word")) {
            return "Word report generated";
        }
        return "report type not supported";
    }
}