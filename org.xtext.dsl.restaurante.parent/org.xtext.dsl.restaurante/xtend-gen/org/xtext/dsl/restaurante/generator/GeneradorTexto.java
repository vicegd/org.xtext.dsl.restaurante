package org.xtext.dsl.restaurante.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.dsl.restaurante.restaurante.BebidaCaliente;
import org.xtext.dsl.restaurante.restaurante.BebidaFria;
import org.xtext.dsl.restaurante.restaurante.Complemento;
import org.xtext.dsl.restaurante.restaurante.Distribuidor;
import org.xtext.dsl.restaurante.restaurante.Ingrediente;
import org.xtext.dsl.restaurante.restaurante.Menu;
import org.xtext.dsl.restaurante.restaurante.Nutricional;
import org.xtext.dsl.restaurante.restaurante.Postre;
import org.xtext.dsl.restaurante.restaurante.Principal;
import org.xtext.dsl.restaurante.restaurante.Producto;
import org.xtext.dsl.restaurante.restaurante.ProductoO;
import org.xtext.dsl.restaurante.restaurante.ProductoY;
import org.xtext.dsl.restaurante.restaurante.Restaurante;
import org.xtext.dsl.restaurante.restaurante.SalsaRecomendada;
import org.xtext.dsl.restaurante.restaurante.TamanioMenu;

@SuppressWarnings("all")
public class GeneradorTexto {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  public GeneradorTexto(final Resource resource, final IFileSystemAccess fsa) {
    this.resource = resource;
    this.fsa = fsa;
  }
  
  public void compilar() {
    StringBuilder sb = new StringBuilder();
    Iterable<Ingrediente> _filter = Iterables.<Ingrediente>filter(IteratorExtensions.<EObject>toIterable(this.resource.getAllContents()), Ingrediente.class);
    for (final Ingrediente i : _filter) {
      sb.append(this.compilarTexto(i));
    }
    this.fsa.generateFile("ingredientes.txt", sb.toString());
    Iterable<Restaurante> _filter_1 = Iterables.<Restaurante>filter(IteratorExtensions.<EObject>toIterable(this.resource.getAllContents()), Restaurante.class);
    for (final Restaurante r : _filter_1) {
      this.fsa.generateFile("resto_informacion.txt", this.compilarTexto(r));
    }
  }
  
  public CharSequence compilarTexto(final Ingrediente i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Ingrediente: ");
    String _nombre = i.getNombre();
    _builder.append(_nombre);
    _builder.append(" código ");
    String _name = i.getName();
    _builder.append(_name);
    _builder.append(" ");
    {
      boolean _isAlergenico = i.isAlergenico();
      if (_isAlergenico) {
        _builder.append("(alergénico)");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      String _infoURL = i.getInfoURL();
      boolean _tripleNotEquals = (_infoURL != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append("Se puede consultar más información en ");
        String _infoURL_1 = i.getInfoURL();
        _builder.append(_infoURL_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _foto = i.getFoto();
      boolean _tripleNotEquals_1 = (_foto != null);
      if (_tripleNotEquals_1) {
        _builder.append("\t");
        _builder.append("Se ha proporcionado una foto para el ingrediente en la ruta imagenes/");
        String _foto_1 = i.getFoto();
        _builder.append(_foto_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compilarTexto(final Restaurante r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Restaurantes ==> ");
    String _nombre = r.getNombre();
    _builder.append(_nombre);
    _builder.newLineIfNotEmpty();
    _builder.append("Fecha de edición ==> ");
    String _fecha = r.getFecha();
    _builder.append(_fecha);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("Información sobre los productos");
    _builder.newLine();
    _builder.append("-------------------------------");
    _builder.newLine();
    {
      EList<Producto> _productos = r.getProductos();
      for(final Producto p : _productos) {
        CharSequence _compilarTexto = this.compilarTexto(p);
        _builder.append(_compilarTexto);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("Información sobre los menús");
    _builder.newLine();
    _builder.append("---------------------------");
    _builder.newLine();
    {
      EList<Menu> _menus = r.getMenus();
      for(final Menu m : _menus) {
        CharSequence _compilarTexto_1 = this.compilarTexto(m);
        _builder.append(_compilarTexto_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compilarTexto(final Producto p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Producto: ");
    String _nombre = p.getNombre();
    _builder.append(_nombre);
    _builder.append(" código ");
    String _name = p.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _descripcion = p.getDescripcion();
      boolean _tripleNotEquals = (_descripcion != null);
      if (_tripleNotEquals) {
        String _descripcion_1 = p.getDescripcion();
        _builder.append(_descripcion_1, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Se ha proporcionado una foto para el ingrediente en la ruta imagenes/");
    String _foto = p.getFoto();
    _builder.append(_foto, "\t");
    _builder.newLineIfNotEmpty();
    {
      Nutricional _nutricional = p.getNutricional();
      boolean _tripleNotEquals_1 = (_nutricional != null);
      if (_tripleNotEquals_1) {
        _builder.append("\t");
        CharSequence _informacionNutricional = this.informacionNutricional(p.getNutricional());
        _builder.append(_informacionNutricional, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    {
      boolean _equals = p.eClass().getName().equals("Principal");
      if (_equals) {
        CharSequence _compilarTexto = this.compilarTexto(((Principal) p));
        _builder.append(_compilarTexto, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
      } else {
        boolean _equals_1 = p.eClass().getName().equals("Complemento");
        if (_equals_1) {
          CharSequence _compilarTexto_1 = this.compilarTexto(((Complemento) p));
          _builder.append(_compilarTexto_1, "\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
        } else {
          boolean _equals_2 = p.eClass().getName().equals("BebidaFria");
          if (_equals_2) {
            CharSequence _compilarTexto_2 = this.compilarTexto(((BebidaFria) p));
            _builder.append(_compilarTexto_2, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
          } else {
            boolean _equals_3 = p.eClass().getName().equals("BebidaCaliente");
            if (_equals_3) {
              CharSequence _compilarTexto_3 = this.compilarTexto(((BebidaCaliente) p));
              _builder.append(_compilarTexto_3, "\t");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
            } else {
              boolean _equals_4 = p.eClass().getName().equals("Postre");
              if (_equals_4) {
                CharSequence _compilarTexto_4 = this.compilarTexto(((Postre) p));
                _builder.append(_compilarTexto_4, "\t");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence informacionNutricional(final Nutricional n) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Por cada ");
    String _cantidad = n.getCantidad();
    _builder.append(_cantidad);
    String _unidad = n.getUnidad();
    _builder.append(_unidad);
    _builder.append(" de producto se proporciona:");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _energia = n.getEnergia();
    _builder.append(_energia, "\t");
    _builder.append("Kcal de energía, ");
    String _grasas = n.getGrasas();
    _builder.append(_grasas, "\t");
    _builder.append("g de grasa, ");
    String _hidratos = n.getHidratos();
    _builder.append(_hidratos, "\t");
    _builder.append("g de hidratos de carbono ");
    String _proteinas = n.getProteinas();
    _builder.append(_proteinas, "\t");
    _builder.append("g de proteinas ");
    String _sal = n.getSal();
    _builder.append(_sal, "\t");
    _builder.append("g de sal");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compilarTexto(final Principal p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEnsalada = p.isEnsalada();
      if (_isEnsalada) {
        _builder.append("Tipo de producto: Ensalada");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("Tipo de producto: Plato principal");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      SalsaRecomendada _salsa = p.getSalsa();
      boolean _equals = Objects.equal(_salsa, SalsaRecomendada.NINGUNA);
      if (_equals) {
      } else {
        SalsaRecomendada _salsa_1 = p.getSalsa();
        boolean _equals_1 = Objects.equal(_salsa_1, SalsaRecomendada.CESAR);
        if (_equals_1) {
          _builder.append("Para este plato se recomienda salsa César");
          _builder.newLine();
        } else {
          SalsaRecomendada _salsa_2 = p.getSalsa();
          boolean _equals_2 = Objects.equal(_salsa_2, SalsaRecomendada.ACEITE_YVINAGRE);
          if (_equals_2) {
            _builder.append("Para este plato se recomienda salsa de aceite y vinagre");
            _builder.newLine();
          } else {
            SalsaRecomendada _salsa_3 = p.getSalsa();
            boolean _equals_3 = Objects.equal(_salsa_3, SalsaRecomendada.MODENA);
            if (_equals_3) {
              _builder.append("Para este plato se recomienda salsa de Módena");
              _builder.newLine();
            } else {
              SalsaRecomendada _salsa_4 = p.getSalsa();
              boolean _equals_4 = Objects.equal(_salsa_4, SalsaRecomendada.MOSTAZA);
              if (_equals_4) {
                _builder.append("Para este plato se recomienda salsa de mostaza");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.append("Listado de ingredientes: ");
    String _ingredientes = this.ingredientes(p.getIngredientes());
    _builder.append(_ingredientes);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String ingredientes(final List<Ingrediente> ingredientes) {
    StringBuilder sb = new StringBuilder();
    for (final Ingrediente i : ingredientes) {
      String _nombre = i.getNombre();
      String _plus = (_nombre + " - ");
      sb.append(_plus);
    }
    return sb.toString();
  }
  
  public CharSequence compilarTexto(final Complemento p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Tipo de producto: Complemento");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilarTexto(final BebidaFria p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Tipo de producto: Bebida fría");
    _builder.newLine();
    _builder.append("Distribuidor: ");
    Distribuidor _distribuidor = p.getDistribuidor();
    _builder.append(_distribuidor);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compilarTexto(final BebidaCaliente p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Tipo de producto: Bebida caliente");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilarTexto(final Postre p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isHelado = p.isHelado();
      if (_isHelado) {
        _builder.append("Tipo de producto: Helado");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("Tipo de producto: Postre no helado");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("Distribuidor: ");
    Distribuidor _distribuidor = p.getDistribuidor();
    _builder.append(_distribuidor);
    _builder.newLineIfNotEmpty();
    _builder.append("Listado de ingredientes: ");
    String _ingredientes = this.ingredientes(p.getIngredientes());
    _builder.append(_ingredientes);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compilarTexto(final Menu m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Menu: ");
    String _nombre = m.getNombre();
    _builder.append(_nombre);
    _builder.append(" código ");
    String _name = m.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Descripción ");
    String _descripcion = m.getDescripcion();
    _builder.append(_descripcion, "\t");
    _builder.newLineIfNotEmpty();
    {
      TamanioMenu _tamanio = m.getTamanio();
      boolean _equals = Objects.equal(_tamanio, TamanioMenu.NORMAL);
      if (_equals) {
        _builder.append("\t");
        _builder.append("Disponible en tamaño normal");
        _builder.newLine();
      } else {
        TamanioMenu _tamanio_1 = m.getTamanio();
        boolean _equals_1 = Objects.equal(_tamanio_1, TamanioMenu.GRANDE);
        if (_equals_1) {
          _builder.append("\t");
          _builder.append("Disponible en tamaño grande");
          _builder.newLine();
        } else {
          TamanioMenu _tamanio_2 = m.getTamanio();
          boolean _equals_2 = Objects.equal(_tamanio_2, TamanioMenu.NORMAL_YGRANDE);
          if (_equals_2) {
            _builder.append("\t");
            _builder.append("Disponible en tamaño normal y grande");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("Foto ");
    String _foto = m.getFoto();
    _builder.append(_foto, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    StringBuilder _productosDelMenuY = this.productosDelMenuY(m.getProductos());
    _builder.append(_productosDelMenuY, "\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringBuilder productosDelMenuY(final ProductoY productoY) {
    StringBuilder sb = new StringBuilder();
    sb.append(this.productosDelMenuO(productoY.getIzq()));
    EList<ProductoO> _der = productoY.getDer();
    for (final ProductoO prO : _der) {
      {
        sb.append("\t+ ");
        sb.append(this.productosDelMenuO(prO));
      }
    }
    return sb;
  }
  
  public StringBuilder productosDelMenuO(final ProductoO productoO) {
    StringBuilder sb = new StringBuilder();
    String _name = productoO.getIzq().getName();
    String _plus = ("El producto: " + _name);
    sb.append(_plus);
    EList<Producto> _der = productoO.getDer();
    for (final Producto pr : _der) {
      String _name_1 = pr.getName();
      String _plus_1 = (" o el producto " + _name_1);
      sb.append(_plus_1);
    }
    sb.append("\r");
    return sb;
  }
}
