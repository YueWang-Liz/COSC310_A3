# COSC310ChatBot A3 [Dino-Bot]
Student Name: Yue Wang

## What is Dino-Bot?
Dino-Bot is a conversation robot that you can talk to ( just like your friend !). We created this chatbot with the idea in mind of conversing with a prehistoric reptile.
Dino-Bot can talk about few different things ( see instructions below ). 

## How to use use our Dino-Bot:
1. Run the command line interface of your preference (eg. command prompt).
2. Redirect the directory to the location of the file.
3. On the console, type: `java -jar dinobot.jar`

When the main image has been loaded,  Dino-bot (Tee-Tee) will ask you to input your name to ensure we can use it when you chat.
You may either input "help" if you want to know what can Dino-Bot can talking about or just jump right into your conversation.
*- Roaring Contest:*
	If your input contain "roar", you may enter or pass to get into roaring contest. 
	When you are in roaring contest, you may roar to the Dino-Bot (input "roar" as many time as you want)and Dino-Bot will give you a respond. You may also type in a sentence and see how Tee-Tee is going to respond to you :) . 
	If you wish to quit, you may input "quit" to exit roaring contest.

*- Collection:*
	Tee-Tee love to collects rocks and bones. Go talk to Tee-Tee about the collection. 
	You may ask: What is your favorite rock? , Why no plants?

*- Food:* 
	You may asking some question about food to the Dino-Bot. 
	For example, What do you like to eat , How do you like your bubble tea? or when will you eat me?   

*- Lord of the Rings:*
	Tee-Tee	loves Lord of the Rings. Go ask Tee-Tee some questions about LOTR.
	Sample inputs: What is your favorite LOTR location

*- Personal Q & A:*
	Want to get to know more about Tee-Tee? Ask Tee-Tee some personal questions.
	Example: How old are you?, Where am I? 
	
Friendly reminder, Tee-Tee does not like swear words. However, you may try and see what will happen.  

## About our code:
We have a main chatbot class, then we have other (topic) classes that implement the interface. All our topic classes are extended from the main chatbot class. When the input ( user's input) first receive, IrrelaventTipic class will process the input and assign the input to the related topic classes and also passes the input to the topic class. In each topic class, it will process the input ( user's input ) and find the reasonable respond to answer (print) the user. 
Before the user type his name, Dino-Bot will show the shape of a dinosaur and our group number.


## updated:
(All the images of example are in the PDF.)
1. Making a simple GUI
This is a very simple GUI named Dino Chatbot. This chatbot can say hello to the users, and ask the users to type their names inside the box. Also users can type the question which they want to ask into the box.
 
2. Adding an extra topic
Comparing to the previous code, the new topic about drinking is added to the chatbot. Users can ask questions about drinking, and Dino-Bot will give the reasonable respond to the users.

3. Giving 5 different responses when the input is outside the two topics
For the new code, Dino-Bot can give 5 different reasonable responses when the users type something which is not include in the two topics
Dino-Bot will give 5 different reasonable responses randomly to the question which is not include in the topics. The five responses are Maybe next topic, I don’t understand it, Let’s try another question, Sorry can you say it again and Sorry I do not know it respectively.

4. the spelling mistakes
For the wrong spelling, Dino-ChatBot can distinguish what this word is. 
Getting the method for the website: https://tartarus.org/martin/PorterStemmer/

5. use of language toolkits
Dino-Bot can divide entire sentence into some exact words.
Part-of-Speech tagging: Getting the method from the website: https://stanfordnlp.github.io/CoreNLP/api.html

6. conversation with another agent
Get the method from the website: http://developer.51cto.com/art/201202/317543.htm
The class named Server is used for accepting the message and when the chatbot receive the message which is bye, it will end the program.
The class named Client is connected with the “Server” class. This class is used for accepting the input of users, and when users press enter, this class will send the message to the “Server” class. Users can enter bye to end the program.




















