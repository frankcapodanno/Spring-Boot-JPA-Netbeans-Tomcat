package click.capodanno.api.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * @author frank <francesco@capodanno.click>
 */
@Entity
@Table(name = "table_test_connect")
@NamedQueries({
    @NamedQuery(name = "TableTestConnect.findAll", query = "SELECT t FROM TableTestConnect t")
    , @NamedQuery(name = "TableTestConnect.findById", query = "SELECT t FROM TableTestConnect t WHERE t.id = :id")
    , @NamedQuery(name = "TableTestConnect.findByTest", query = "SELECT t FROM TableTestConnect t WHERE t.test = :test")})
public class TableTestConnect implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2)
    @Column(name = "test")
    private String test;

    public TableTestConnect() {
    }

    public TableTestConnect(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TableTestConnect)) {
            return false;
        }
        TableTestConnect other = (TableTestConnect) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "click.capodanno.api.entities.TableTestConnect[ id=" + id + " ]";
    } 
}