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
import org.xtext.dsl.restaurante.restaurante.BebidaFria;
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
public class GeneradorWeb {
  private Resource resource;
  
  private IFileSystemAccess fsa;
  
  public GeneradorWeb(final Resource resource, final IFileSystemAccess fsa) {
    this.resource = resource;
    this.fsa = fsa;
  }
  
  public void compilar() {
    Iterable<Restaurante> _filter = Iterables.<Restaurante>filter(IteratorExtensions.<EObject>toIterable(this.resource.getAllContents()), Restaurante.class);
    for (final Restaurante r : _filter) {
      this.compilarTexto(r);
    }
  }
  
  public CharSequence compilarTexto(final Restaurante r) {
    StringConcatenation _builder = new StringConcatenation();
    this.fsa.generateFile("scripts/ingredientes_gen.inc", this.compilarIngredientes(r.getIngredientes()));
    _builder.newLineIfNotEmpty();
    this.fsa.generateFile("scripts/productos_gen.inc", this.compilarProductos(r.getProductos()));
    _builder.newLineIfNotEmpty();
    this.fsa.generateFile("scripts/menus_gen.inc", this.compilarMenus(r.getMenus()));
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compilarIngredientes(final List<Ingrediente> ingredientes) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var code = \'<table class=\"tingredientes\">\\");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<tr class=\"tingredientes_cabecera\">\\");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<td></td>\\");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<td>Ingrediente</td>\\");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<td>Alérgeno</td>\\");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</tr>\\");
    _builder.newLine();
    {
      for(final Ingrediente i : ingredientes) {
        _builder.append("\t");
        CharSequence _compilarTexto = this.compilarTexto(i);
        _builder.append(_compilarTexto, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</table>\';");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilarTexto(final Ingrediente i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<tr>\\");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<td><img class=\"ingredientes\" src=\"imagenes/");
    {
      String _foto = i.getFoto();
      boolean _tripleNotEquals = (_foto != null);
      if (_tripleNotEquals) {
        String _foto_1 = i.getFoto();
        _builder.append(_foto_1, "\t");
      } else {
        _builder.append("generico.jpg");
      }
    }
    _builder.append("\" alt=\"");
    String _nombre = i.getNombre();
    _builder.append(_nombre, "\t");
    _builder.append(" (");
    String _name = i.getName();
    _builder.append(_name, "\t");
    _builder.append(")\" title=\"");
    String _nombre_1 = i.getNombre();
    _builder.append(_nombre_1, "\t");
    _builder.append(" (");
    String _name_1 = i.getName();
    _builder.append(_name_1, "\t");
    _builder.append(")\" /></td>\\");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<td>");
    {
      String _infoURL = i.getInfoURL();
      boolean _tripleNotEquals_1 = (_infoURL != null);
      if (_tripleNotEquals_1) {
        _builder.append("<a href=\"");
        String _infoURL_1 = i.getInfoURL();
        _builder.append(_infoURL_1, "\t");
        _builder.append("\" target=\"_blank\">");
        String _nombre_2 = i.getNombre();
        _builder.append(_nombre_2, "\t");
        _builder.append("</a>");
      } else {
        String _nombre_3 = i.getNombre();
        _builder.append(_nombre_3, "\t");
      }
    }
    _builder.append("</td>\\");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<td><img class=\"alergenos\" src=\"imagenes/");
    {
      boolean _isAlergenico = i.isAlergenico();
      if (_isAlergenico) {
        _builder.append("alergeno.png");
      } else {
        _builder.append("noalergeno.png");
      }
    }
    _builder.append("\" alt=\"Este ingrediente ");
    {
      boolean _isAlergenico_1 = i.isAlergenico();
      boolean _not = (!_isAlergenico_1);
      if (_not) {
        _builder.append("no ");
      }
    }
    _builder.append("contiene alérgenos\" title=\"Este ingrediente ");
    {
      boolean _isAlergenico_2 = i.isAlergenico();
      boolean _not_1 = (!_isAlergenico_2);
      if (_not_1) {
        _builder.append("no ");
      }
    }
    _builder.append("contiene alérgenos\" /></td>\\");
    _builder.newLineIfNotEmpty();
    _builder.append("</tr>\\");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilarProductos(final List<Producto> productos) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var code = \'");
    {
      for(final Producto p : productos) {
        CharSequence _compilarTexto = this.compilarTexto(p);
        _builder.append(_compilarTexto);
      }
    }
    _builder.append("\';");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compilarTexto(final Producto p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _equals = p.eClass().getName().equals("Principal");
      if (_equals) {
        Principal principal = ((Principal) p);
        _builder.newLineIfNotEmpty();
        {
          boolean _isEnsalada = principal.isEnsalada();
          if (_isEnsalada) {
            _builder.append("<div class=\"caja_producto_principal_ensalada\"><div class=\"caja\">\\");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("<div class=\"caja_producto_principal\"><div class=\"caja\">\\");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        boolean _equals_1 = p.eClass().getName().equals("Complemento");
        if (_equals_1) {
          _builder.append("<div class=\"caja_producto_complemento\"><div class=\"caja\">\\");
          _builder.newLine();
        } else {
          boolean _equals_2 = p.eClass().getName().equals("BebidaFria");
          if (_equals_2) {
            _builder.append("<div class=\"caja_producto_bebida_fria\"><div class=\"caja\">\\");
            _builder.newLine();
          } else {
            boolean _equals_3 = p.eClass().getName().equals("BebidaCaliente");
            if (_equals_3) {
              _builder.append("<div class=\"caja_producto_bebida_caliente\"><div class=\"caja\">\\");
              _builder.newLine();
            } else {
              boolean _equals_4 = p.eClass().getName().equals("Postre");
              if (_equals_4) {
                _builder.append("<div class=\"caja_producto_postre\"><div class=\"caja\">\\");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("<img src=\"imagenes/");
    String _foto = p.getFoto();
    _builder.append(_foto, "\t");
    _builder.append("\" alt=\"");
    String _nombre = p.getNombre();
    _builder.append(_nombre, "\t");
    _builder.append(" (");
    String _name = p.getName();
    _builder.append(_name, "\t");
    _builder.append(")\" title=\"");
    String _nombre_1 = p.getNombre();
    _builder.append(_nombre_1, "\t");
    _builder.append(" (");
    String _name_1 = p.getName();
    _builder.append(_name_1, "\t");
    _builder.append(")\" />\\");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<h2>");
    String _nombre_2 = p.getNombre();
    _builder.append(_nombre_2, "\t");
    _builder.append("</h2>\\");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div class=\"caja_descripcion\">");
    String _descripcion = p.getDescripcion();
    _builder.append(_descripcion, "\t");
    _builder.append("</div>\\");
    _builder.newLineIfNotEmpty();
    {
      boolean _equals_5 = p.eClass().getName().equals("Principal");
      if (_equals_5) {
        _builder.append("\t");
        Principal principal_1 = ((Principal) p);
        _builder.newLineIfNotEmpty();
        {
          int _size = principal_1.getIngredientes().size();
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            _builder.append("\t");
            _builder.append("<h3>Listado de ingredientes:</h3>\\");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<div class=\"caja_ingredientes\">");
            String _ingredientes = this.ingredientes(principal_1.getIngredientes());
            _builder.append(_ingredientes, "\t");
            _builder.append(" (<a href=\"ingredientes.html\">ver</a>)</div>\\");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          SalsaRecomendada _salsa = principal_1.getSalsa();
          boolean _equals_6 = Objects.equal(_salsa, SalsaRecomendada.NINGUNA);
          if (_equals_6) {
          } else {
            SalsaRecomendada _salsa_1 = principal_1.getSalsa();
            boolean _equals_7 = Objects.equal(_salsa_1, SalsaRecomendada.CESAR);
            if (_equals_7) {
              _builder.append("\t");
              _builder.append("<div class=\"caja_salsa\">*Para este plato se recomienda la salsa César</div>\\");
              _builder.newLine();
            } else {
              SalsaRecomendada _salsa_2 = principal_1.getSalsa();
              boolean _equals_8 = Objects.equal(_salsa_2, SalsaRecomendada.ACEITE_YVINAGRE);
              if (_equals_8) {
                _builder.append("\t");
                _builder.append("<div class=\"caja_salsa\">*Para este plato se recomienda la salsa de aceite y vinagre</div>\\");
                _builder.newLine();
              } else {
                SalsaRecomendada _salsa_3 = principal_1.getSalsa();
                boolean _equals_9 = Objects.equal(_salsa_3, SalsaRecomendada.MODENA);
                if (_equals_9) {
                  _builder.append("\t");
                  _builder.append("<div class=\"caja_salsa\">*Para este plato se recomienda la salsa de Módena</div>\\");
                  _builder.newLine();
                } else {
                  SalsaRecomendada _salsa_4 = principal_1.getSalsa();
                  boolean _equals_10 = Objects.equal(_salsa_4, SalsaRecomendada.MOSTAZA);
                  if (_equals_10) {
                    _builder.append("\t");
                    _builder.append("<div class=\"caja_salsa\">*Para este plato se recomienda la salsa de mostaza</div>\\");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
      } else {
        boolean _equals_11 = p.eClass().getName().equals("BebidaFria");
        if (_equals_11) {
          _builder.append("\t");
          BebidaFria bebidaFria = ((BebidaFria) p);
          _builder.newLineIfNotEmpty();
          {
            Distribuidor _distribuidor = bebidaFria.getDistribuidor();
            boolean _tripleNotEquals = (_distribuidor != null);
            if (_tripleNotEquals) {
              _builder.append("\t");
              _builder.append("<h3>Distribuidor:</h3>\\");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("<div class=\"caja_distribuidor\">");
              Distribuidor _distribuidor_1 = bebidaFria.getDistribuidor();
              _builder.append(_distribuidor_1, "\t");
              _builder.append("</div>\\");
              _builder.newLineIfNotEmpty();
            }
          }
        } else {
          boolean _equals_12 = p.eClass().getName().equals("Postre");
          if (_equals_12) {
            _builder.append("\t");
            Postre postre = ((Postre) p);
            _builder.newLineIfNotEmpty();
            {
              int _size_1 = postre.getIngredientes().size();
              boolean _greaterThan_1 = (_size_1 > 0);
              if (_greaterThan_1) {
                _builder.append("\t");
                _builder.append("<h3>Listado de ingredientes: </h3>\\");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("<div class=\"caja_ingredientes\">");
                String _ingredientes_1 = this.ingredientes(postre.getIngredientes());
                _builder.append(_ingredientes_1, "\t");
                _builder.append(" (<a href=\"ingredientes.html\">ver</a>)</div>\\");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              Distribuidor _distribuidor_2 = postre.getDistribuidor();
              boolean _tripleNotEquals_1 = (_distribuidor_2 != null);
              if (_tripleNotEquals_1) {
                _builder.append("\t");
                _builder.append("<h3>Distribuidor:</h3>\\");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("<div class=\"caja_distribuidor\">");
                Distribuidor _distribuidor_3 = postre.getDistribuidor();
                _builder.append(_distribuidor_3, "\t");
                _builder.append("</div>\\");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    {
      Nutricional _nutricional = p.getNutricional();
      boolean _tripleNotEquals_2 = (_nutricional != null);
      if (_tripleNotEquals_2) {
        _builder.append("\t");
        _builder.append("<h3>Información nutricional:</h3>\\");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<div class=\"caja_nutricional\">\\");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<div class=\"caja_nutricional_elemento\">Valor nutricional para ");
        String _cantidad = p.getNutricional().getCantidad();
        _builder.append(_cantidad, "\t\t");
        _builder.append(" ");
        String _unidad = p.getNutricional().getUnidad();
        _builder.append(_unidad, "\t\t");
        _builder.append("</div>\\");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<div class=\"caja_nutricional_elemento\">Energía: ");
        String _energia = p.getNutricional().getEnergia();
        _builder.append(_energia, "\t\t");
        _builder.append("kcal</div>\\");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<div class=\"caja_nutricional_elemento\">Grasas: ");
        String _grasas = p.getNutricional().getGrasas();
        _builder.append(_grasas, "\t\t");
        _builder.append("g</div>\\");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<div class=\"caja_nutricional_elemento\">Hidratos de carbono: ");
        String _hidratos = p.getNutricional().getHidratos();
        _builder.append(_hidratos, "\t\t");
        _builder.append("g</div>\\");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<div class=\"caja_nutricional_elemento\">Proteínas: ");
        String _proteinas = p.getNutricional().getProteinas();
        _builder.append(_proteinas, "\t\t");
        _builder.append("g</div>\\");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<div class=\"caja_nutricional_elemento\">Sal: ");
        String _sal = p.getNutricional().getSal();
        _builder.append(_sal, "\t\t");
        _builder.append("g</div>\\");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</div>\\");
        _builder.newLine();
      }
    }
    _builder.append("</div></div>\\");
    _builder.newLine();
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
  
  public CharSequence compilarMenus(final List<Menu> menus) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var code = \'");
    {
      for(final Menu m : menus) {
        CharSequence _compilarTexto = this.compilarTexto(m);
        _builder.append(_compilarTexto);
      }
    }
    _builder.append("\';");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compilarTexto(final Menu m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"caja_menu\"><div class=\"caja\">\\");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<img src=\"imagenes/");
    String _foto = m.getFoto();
    _builder.append(_foto, "\t");
    _builder.append("\" alt=\"");
    String _nombre = m.getNombre();
    _builder.append(_nombre, "\t");
    _builder.append(" (");
    String _name = m.getName();
    _builder.append(_name, "\t");
    _builder.append(")\" title=\"");
    String _nombre_1 = m.getNombre();
    _builder.append(_nombre_1, "\t");
    _builder.append(" (");
    String _name_1 = m.getName();
    _builder.append(_name_1, "\t");
    _builder.append(")\" />\\");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<h2>");
    String _nombre_2 = m.getNombre();
    _builder.append(_nombre_2, "\t");
    _builder.append("</h2>\\");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div class=\"caja_descripcion\">");
    String _descripcion = m.getDescripcion();
    _builder.append(_descripcion, "\t");
    _builder.append("</div>\\");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div class=\"caja_tamanio\">");
    String _tamanioMenu = this.tamanioMenu(m.getTamanio());
    _builder.append(_tamanioMenu, "\t");
    _builder.append("</div>\\");
    _builder.newLineIfNotEmpty();
    {
      ProductoY _productos = m.getProductos();
      boolean _tripleNotEquals = (_productos != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append("<h3>Productos incluidos:</h3>\\");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<div class=\"caja_productos_incluidos\">\\");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<ul>\\");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        StringBuilder _productosDelMenuY = this.productosDelMenuY(m.getProductos());
        _builder.append(_productosDelMenuY, "\t\t");
        _builder.append("\\");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("</ul>\\");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</div>\\");
        _builder.newLine();
      }
    }
    _builder.append("</div></div>\\");
    _builder.newLine();
    return _builder;
  }
  
  public String tamanioMenu(final TamanioMenu t) {
    String result = new String();
    if (t != null) {
      switch (t) {
        case GRANDE:
          result = "Este menú se presenta en tamaño grande";
          break;
        case NORMAL:
          result = "Este menú se presenta en tamaño normal";
          break;
        case NORMAL_YGRANDE:
          result = "Este menú está disponible tanto en tamaño normal como en tamaño grande";
          break;
        default:
          break;
      }
    }
    return result;
  }
  
  public StringBuilder productosDelMenuY(final ProductoY productoY) {
    StringBuilder sb = new StringBuilder();
    StringBuilder _productosDelMenuO = this.productosDelMenuO(productoY.getIzq());
    String _plus = ("<li>" + _productosDelMenuO);
    sb.append(_plus);
    EList<ProductoO> _der = productoY.getDer();
    for (final ProductoO prO : _der) {
      {
        sb.append("<li>");
        sb.append(this.productosDelMenuO(prO));
      }
    }
    return sb;
  }
  
  public StringBuilder productosDelMenuO(final ProductoO productoO) {
    StringBuilder sb = new StringBuilder();
    sb.append(productoO.getIzq().getNombre());
    EList<Producto> _der = productoO.getDer();
    for (final Producto pr : _der) {
      String _nombre = pr.getNombre();
      String _plus = (" o " + _nombre);
      sb.append(_plus);
    }
    sb.append("</li>");
    return sb;
  }
}
