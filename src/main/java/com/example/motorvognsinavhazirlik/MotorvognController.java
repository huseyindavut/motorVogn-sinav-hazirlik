package com.example.motorvognsinavhazirlik;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class MotorvognController {
  private List<Motorvogn> motorvogns=new ArrayList<Motorvogn>();
  private List<Bil> bils=new ArrayList<>();
  public MotorvognController() {
      Bil bil1=new Bil("Audi","Q7");
      bils.add(bil1);
      Bil bil2=new Bil("Audi","Q5");
      bils.add(bil2);
      Bil bil3=new Bil("Audi","Q3");
        bils.add(bil3);
      Bil bil4=new Bil("Volvo","V40");
      bils.add(bil4);
      Bil bil5=new Bil("Volvo","V30");
      bils.add(bil5);
      Bil bil6=new Bil("Volvo","V20");
      bils.add(bil6);

  }
  @PostMapping("/lagreMotorvogn")
  public void lagreMotorvogn(Motorvogn motorvogn) {
      motorvogns.add(motorvogn);
  }
  @GetMapping("/henteMotorvogn")
  public List<Motorvogn> henteMotorvogn(){
      return motorvogns;
  }
  @GetMapping("/henteBil")
    public List<Bil> henterBil(){
        return bils;
    }
    @DeleteMapping("/slettMotorvogn")
  public void slettMotorvogn() {
      motorvogns.clear();
  }

}
