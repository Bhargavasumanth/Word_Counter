import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class WordCounter extends JFrame {
    private JTextArea textArea;
    private JButton countButton;

    public WordCounter() {
        setTitle("Word Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        countButton = new JButton("Count Words");

        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String paragraph = textArea.getText();
                int wordCount = countWords(paragraph);
                JOptionPane.showMessageDialog(null, "Word Count: " + wordCount);
            }
        });

        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(countButton, BorderLayout.SOUTH);
    }

    private int countWords(String paragraph) 
    {
        if (paragraph.isEmpty()) {
            return 0;
        }

        String[] words = paragraph.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                WordCounter wordCounter = new WordCounter();
                wordCounter.setVisible(true);
            }
        });
    }
}