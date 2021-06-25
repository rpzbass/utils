package serializacao.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import serializacao.classes.Aluno;
import serializacao.classes.Turma;

public class SerializacaoTest {

	public static void main(String[] args) {

		gravadorObjeto();

		leitorObjeto();

	}

	public static void gravadorObjeto() {

		Aluno aluno = new Aluno(1L, "Willian", "123456",new Turma("Maratona Java "));
		
		try {

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"));
			oos.writeObject(aluno);
			oos.close();

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

	
	public static void leitorObjeto() {

		try {

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"));

			Aluno alunoinstancia = (Aluno) ois.readObject();

			System.out.println(alunoinstancia);

			ois.close();

		} catch (IOException | ClassNotFoundException e) {

			e.printStackTrace();

		}

	}

}
