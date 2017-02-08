package click.capodanno.api.entities;

import click.capodanno.api.entities.TableTestConnect;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
/**
 * @author frank
 */
@Transactional
public interface TableTestConnectRepository extends CrudRepository<TableTestConnect, Long> {
    TableTestConnect findById(int id);
}
