# Word Counter

- This code defines a Java class called WordCounter that extends the JFrame class, which is a window container in Swing, a Java GUI toolkit. The purpose of this class is to create a word counting application with a graphical user interface.
- The class WordCounter extends JFrame, which means it inherits all the properties and methods of the JFrame class.
- Inside the WordCounter class, there are two instance variables: textArea and countButton. These variables are declared as private, which means they can only be accessed within the WordCounter class.

## Program Working

- The constructor WordCounter() is defined. This constructor is called when an object of the WordCounter class is created. Inside the constructor, the following tasks are performed
- The title of the window is set to "Word Counter" using the setTitle() method.
- The default close operation is set to JFrame.EXIT_ON_CLOSE, which means the application will exit when the window is closed.
- The size of the window is set to 400 pixels wide and 300 pixels high using the setSize() method.
- The window is centered on the screen using the setLocationRelativeTo(null) method.
- An instance of JTextArea is created and assigned to the textArea variable.
- An instance of JButton is created with the label "Count Words" and assigned to the countButton variable.
- An action listener is added to the countButton using an anonymous inner class. When the button is clicked, the actionPerformed() method of the action listener is called.
- Inside the actionPerformed() method, the text entered in the textArea is retrieved using the getText() method. The countWords() method is then called with the retrieved text as an argument to count the number of words.
- The word count is displayed in a message dialog using the JOptionPane.showMessageDialog() method.

## Tasks to be followed

- The countWords() method is defined as a private method within the WordCounter class. It takes a String parameter called paragraph and returns an int representing the number of words in the paragraph. The method performs the following tasks:
- It checks if the paragraph is empty using the isEmpty() method. If it is empty, the method returns 0.
- Otherwise, it splits the paragraph into an array of words using the split() method with the regular expression "\s+" as the delimiter. This regular expression matches one or more whitespace characters.
- The length of the resulting array is returned as the word count.
- The main() method is defined as a static method. It is the entry point of the program. Inside the main() method, the following tasks are performed:

## About Swing Utilities, other Invoking Methods working Procedure

- The SwingUtilities.invokeLater() method is called with an anonymous inner class that implements the Runnable interface. This ensures that the Swing components are created and updated on the Event Dispatch Thread (EDT), which is the main thread for handling GUI events.
- Inside the run() method of the anonymous inner class, an instance of WordCounter is created and assigned to the wordCounter variable.
- The setVisible() method is called on the wordCounter object to make the window visible.
- Overall, this code creates a simple word counting application with a graphical user interface using Swing components. When the "Count Words" button is clicked, the application counts the number of words entered in the JTextArea and displays the count in a message dialog.
