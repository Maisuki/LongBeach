/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 *
 * @author Elliot
 */
public class LongBeachBot extends TelegramLongPollingBot {
    
    
    @Override
    public String getBotToken() {
        return "533265010:AAH5ORLjdspqoTLZxV_ubgiOe3Z76huSU2M";
    }

    @Override
    public void onUpdateReceived(Update update) {
       System.out.println(update.getMessage().getText());
       SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
       sendMessage.setText("Hello");
        
       try {
            sendMessage(sendMessage);
        } catch (TelegramApiException ex) {
            Logger.getLogger(LongBeachBot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getBotUsername() {
        return "LongBeach_Bot";
    }
    
    
    
}
