package com.example.server.Controller;

import com.example.server.Repositories.UserModelRepository;
import com.example.server.models.UserModel;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@Controller
public class WebsiteController {
    @Autowired
    UserModelRepository userModelRepository;

    @GetMapping("/")
    public String getHomePage() {
        return "index.html";
    }

    @GetMapping("/signup")
    public String getSignupPage() {
        return "/signup.html";
    }

    @PostMapping("/signup")
    public RedirectView signUpUser(String username, String password) {
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt(12));
        UserModel newUser = new UserModel(username, hashedPassword);

        userModelRepository.save(newUser);
        return new RedirectView("login");
    }
    @PostMapping("/login")
    public RedirectView logInUSerWithSecret(HttpServletRequest request, String username, String password){
        UserModel userFromDb= userModelRepository.findByUsername(username);
        if((userFromDb == null)
                || (!BCrypt.checkpw(password, userFromDb.getPassword())))
        {

            return new RedirectView("/login");
        }
        HttpSession session= request.getSession();
        session.setAttribute("username", username);

        return new RedirectView("/MainPage");
    }
    @PostMapping("logout")
    public RedirectView logOutUser(HttpServletRequest request){

        HttpSession session= request.getSession();
        session.invalidate();

        return new RedirectView("/login");
    }
    @GetMapping("/login")
    public String getLoginPageWithSecret(){
        return "login.html";
    }
    @GetMapping("/MainPage")
    public String getMainPage(HttpServletRequest request, Model m){

        HttpSession session = request.getSession();
        String username= session.getAttribute("username").toString();

        m.addAttribute("username", username);
        return "mainpage.html";
    }

}
