package click.capodanno.api;

import click.capodanno.api.entities.TableTestConnect;
import click.capodanno.api.entities.TableTestConnectRepository;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConnectionController {
    @Autowired
    private TableTestConnectRepository repository;
    
    @RequestMapping("/testdb")
    public TableTestConnect testconnect(){
       Iterable<TableTestConnect> source = repository.findAll();
       int sizea = Iterables.size(source);
       if (sizea == 0){
          TableTestConnect testNotPassed = new TableTestConnect();
          testNotPassed.setId(0);
          testNotPassed.setTest("there is not connection or the table for the testing was not creating");
          return testNotPassed;
       }
       List<TableTestConnect> t = new ArrayList<>();
       source.forEach(t::add);  
       return t.get(0);
    }
}