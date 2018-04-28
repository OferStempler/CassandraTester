package ofer.stempler.model;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;

/**
 * Created by ofer on 28/04/18.
 */
@Table ("people")
@Data
public class Person implements Serializable {

    @PrimaryKey
//    @CassandraType(type = DataType.Name.TEXT)
    private String id;
    private String name;

}
