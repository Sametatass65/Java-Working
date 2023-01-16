public interface IEntityRepository<T extends IEntity> {
    // interfacenin extends edilmesi sadece bu şekilde geçerlidir
    // sadece IEntity'yi inherit edeni yazabiliriz manasınıda
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
