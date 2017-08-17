
package dao;


import java.sql.Date;
import model.Carro;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class CarroDAOJUnitTest {
    
   @Test
   public void inserir(){
       Carro gol = new Carro();
       gol.setDataCompra(new Date(2017, 8, 14));
       gol.setAnoFabricacao((short)2017);
       gol.setAnoLancamento((short)2017);
       gol.setChassi("5151874");
       gol.setCor("Vermelho");
       gol.setDescricao("hugouytkjhgutyd jhgpiuylkj poiwert");
       gol.setEstaFuncional(false);
       gol.setFabricante("VW");
       gol.setNome("Gol");
       gol.setPlaca("FLA-2017");
       gol.setPotencia("100");
       gol.setPermitidaCirculacao(true);
       gol.setQuantidadeBatidas((byte)0);
       gol.setQuantidadePortas((byte)4);
       gol.setQuilometragem(15887f);
       gol.setTipoPneu("17");
       gol.setRenavam(198745);
      
       CarroDAO dao = new CarroDAO();
       dao.truncate();
       int codigo = dao.inserir(gol);
       assertEquals(codigo, 1);
       
       gol.setId(codigo);
       
       Carro carroBuscado = dao.buscarPorId(codigo);
       validarIgualdadeCarro(gol, carroBuscado);
          
   }
   
   public void validarIgualdadeCarro(Carro carro, Carro outroCarro){
       assertEquals(carro.getId(), carro.getId());
       assertEquals(carro.getAnoFabricacao(), outroCarro.getAnoFabricacao());
       assertEquals(carro.getAnoLancamento(), outroCarro.getAnoLancamento());
       assertEquals(carro.getChassi(), outroCarro.getChassi());
       assertEquals(carro.getCor(), outroCarro.getCor());
       assertEquals(carro.getDataCompra(), outroCarro.getDataCompra());
       assertEquals(carro.getDescricao(), outroCarro.getDescricao());
       assertEquals(carro.getFabricante(), outroCarro.getFabricante());
       assertEquals(carro.getNome(), outroCarro.getNome());
       assertEquals(carro.getPlaca(), outroCarro.getPlaca());
       assertEquals(carro.getPotencia(), outroCarro.getPotencia(),0);
       assertEquals(carro.getQuantidadeBatidas(), outroCarro.getQuantidadeBatidas());
       assertEquals(carro.getQuantidadePortas(), outroCarro.getQuantidadePortas());
       assertEquals(carro.getQuilometragem(), outroCarro.getQuilometragem(),0);
       assertEquals(carro.getRenavam(), outroCarro.getRenavam());
       assertEquals(carro.getTipoPneu(), outroCarro.getTipoPneu());
       assertEquals(carro.isEstaFuncional(), outroCarro.isEstaFuncional());
       assertEquals(carro.isPermitidaCirculacao(), outroCarro.isPermitidaCirculacao());
   }
    
   @Test
   public void excluir(){
       Carro gol = new Carro();
       gol.setDataCompra(new Date(2017, 8, 14));
       gol.setAnoFabricacao((short)2017);
       gol.setAnoLancamento((short)2017);
       gol.setChassi("5151874");
       gol.setCor("Vermelho");
       gol.setDescricao("hugouytkjhgutyd jhgpiuylkj poiwert");
       gol.setEstaFuncional(false);
       gol.setFabricante("VW");
       gol.setNome("Gol");
       gol.setPlaca("FLA-2017");
       gol.setPotencia("100");
       gol.setPermitidaCirculacao(true);
       gol.setQuantidadeBatidas((byte)0);
       gol.setQuantidadePortas((byte)4);
       gol.setQuilometragem(15887f);
       gol.setTipoPneu("17");
       gol.setRenavam(198745);
       
       CarroDAO dao = new CarroDAO();
       dao.truncate();
       int codigo = dao.inserir(gol);
       dao.excluir(codigo);
       
       Carro carrBuscado = dao.buscarPorId(codigo);
       assertNull(carrBuscado);
       
       
   }
   
   @Test
   public void alterar(){
       Carro gol = new Carro();
       gol.setDataCompra(new Date(2017, 8, 14));
       gol.setAnoFabricacao((short)2017);
       gol.setAnoLancamento((short)2017);
       gol.setChassi("5151874");
       gol.setCor("Vermelho");
       gol.setDescricao("hugouytkjhgutyd jhgpiuylkj poiwert");
       gol.setEstaFuncional(false);
       gol.setFabricante("VW");
       gol.setNome("Gol");
       gol.setPlaca("FLA-2017");
       gol.setPotencia("100");
       gol.setPermitidaCirculacao(true);
       gol.setQuantidadeBatidas((byte)0);
       gol.setQuantidadePortas((byte)4);
       gol.setQuilometragem(15887f);
       gol.setTipoPneu("17");
       gol.setRenavam(198745);
       
       CarroDAO dao = new CarroDAO();
       dao.truncate();
       int codigo = dao.inserir(gol);
       gol.setId(codigo);
       
       gol.setDataCompra(new Date(2016, 10, 10));
       gol.setAnoFabricacao((short)2016);
       gol.setAnoLancamento((short)2016);
       gol.setChassi("000000");
       gol.setCor("Azul");
       gol.setDescricao("novo comentário para test");
       gol.setEstaFuncional(true);
       gol.setFabricante("FIAT");
       gol.setNome("UNO");
       gol.setPlaca("SPF-2015");
       gol.setPotencia("250");
       gol.setPermitidaCirculacao(false);
       gol.setQuantidadeBatidas((byte)1);
       gol.setQuantidadePortas((byte)2);
       gol.setQuilometragem(14000f);
       gol.setTipoPneu("17");
       gol.setRenavam(889988);
       dao.alterar(gol);
       
       Carro carroModificado = dao.buscarPorId(gol.getId());
       validarIgualdadeCarro(gol, carroModificado);
       
   }
   
}
