
package datos.interfaces;

import java.util.List;


public interface CrudSimpleInterface<T> {
   public List<T> listar(String texto);
   public boolean insertar(T obj);
   public boolean actualizar(T obj);
   public boolean desactivar(int cod_producto);
   public boolean activar(int cod_producto);
   public int total();
   public boolean existe(String texto);
}
