package InterfacesRepositorio.Modelo;

public class BaseEntity {
    protected Integer id;
    private static int UltimoId;

    public BaseEntity() {
        this.id = ++UltimoId; //id automatico
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity base = (BaseEntity) o;
        return this.id != null && this.id.equals(base.id);
    }


}
