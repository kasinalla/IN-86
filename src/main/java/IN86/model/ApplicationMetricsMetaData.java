package IN86.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "application_metrics_metadata")
@Data
public class ApplicationMetricsMetaData {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String metric;
    private long goodValue;
    private long criticalValue;
    private long weight;

}
