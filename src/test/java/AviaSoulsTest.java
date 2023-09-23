import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {

    @Test
    public void TestSortTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Сочи", "Москва", 15_000, 10, 12);
        Ticket ticket2 = new Ticket("Калининград", "Москва", 21_000, 11, 15);
        Ticket ticket3 = new Ticket("Сочи", "Москва", 10_000, 2, 6);
        Ticket ticket4 = new Ticket("Сочи", "Москва", 14_000, 16, 19);
        Ticket ticket5 = new Ticket("Сочи", "Хабаровск", 30_000, 10, 17);
        Ticket ticket6 = new Ticket("Сочи", "Москва", 20_000, 12, 16);
        Ticket ticket7 = new Ticket("Сочи", "Москва", 19_000, 19, 22);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket3, ticket4, ticket1, ticket7, ticket6};
        Ticket[] actual = manager.search("Сочи", "Москва");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test2SortTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Сочи", "Москва", 15_000, 10, 12);
        Ticket ticket2 = new Ticket("Калининград", "Москва", 21_000, 11, 15);
        Ticket ticket3 = new Ticket("Сочи", "Москва", 10_000, 2, 6);
        Ticket ticket4 = new Ticket("Сочи", "Москва", 14_000, 16, 19);
        Ticket ticket5 = new Ticket("Сочи", "Хабаровск", 30_000, 10, 17);
        Ticket ticket6 = new Ticket("Сочи", "Москва", 20_000, 12, 16);
        Ticket ticket7 = new Ticket("Сочи", "Москва", 19_000, 19, 22);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {};
        Ticket[] actual = manager.search("Сочи", "Калининград");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test3SortTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Сочи", "Москва", 15_000, 10, 12);
        Ticket ticket2 = new Ticket("Калининград", "Москва", 21_000, 11, 15);
        Ticket ticket3 = new Ticket("Сочи", "Москва", 10_000, 2, 6);
        Ticket ticket4 = new Ticket("Сочи", "Москва", 14_000, 16, 19);
        Ticket ticket5 = new Ticket("Сочи", "Хабаровск", 30_000, 10, 17);
        Ticket ticket6 = new Ticket("Сочи", "Москва", 20_000, 12, 16);
        Ticket ticket7 = new Ticket("Сочи", "Москва", 19_000, 19, 22);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket5};
        Ticket[] actual = manager.search("Сочи", "Хабаровск");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test1SortTicketsWithComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Сочи", "Москва", 15_000, 10, 12);
        Ticket ticket2 = new Ticket("Калининград", "Москва", 21_000, 11, 15);
        Ticket ticket3 = new Ticket("Сочи", "Москва", 10_000, 2, 6);
        Ticket ticket4 = new Ticket("Сочи", "Москва", 14_000, 16, 19);
        Ticket ticket5 = new Ticket("Сочи", "Хабаровск", 30_000, 10, 17);
        Ticket ticket6 = new Ticket("Сочи", "Москва", 20_000, 12, 16);
        Ticket ticket7 = new Ticket("Сочи", "Москва", 19_000, 19, 22);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] expected = {ticket5};
        Ticket[] actual = manager.searchAndSortBy("Сочи", "Хабаровск", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test2SortTicketsWithComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Сочи", "Москва", 15_000, 10, 12);
        Ticket ticket2 = new Ticket("Калининград", "Москва", 21_000, 11, 15);
        Ticket ticket3 = new Ticket("Сочи", "Москва", 10_000, 2, 6);
        Ticket ticket4 = new Ticket("Сочи", "Москва", 14_000, 16, 19);
        Ticket ticket5 = new Ticket("Сочи", "Хабаровск", 30_000, 10, 17);
        Ticket ticket6 = new Ticket("Сочи", "Москва", 20_000, 12, 16);
        Ticket ticket7 = new Ticket("Сочи", "Москва", 19_000, 19, 22);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] expected = {};
        Ticket[] actual = manager.searchAndSortBy("Сочи", "Калининград", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test3SortTicketsWithComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Сочи", "Москва", 15_000, 10, 12);//2
        Ticket ticket2 = new Ticket("Калининград", "Москва", 21_000, 11, 15);
        Ticket ticket3 = new Ticket("Сочи", "Москва", 10_000, 2, 5);//3
        Ticket ticket4 = new Ticket("Сочи", "Москва", 14_000, 16, 22);//6
        Ticket ticket5 = new Ticket("Сочи", "Хабаровск", 30_000, 10, 17);
        Ticket ticket6 = new Ticket("Сочи", "Москва", 20_000, 12, 16);//4
        Ticket ticket7 = new Ticket("Сочи", "Москва", 19_000, 18, 23);//5

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] expected = {ticket1, ticket3, ticket6, ticket7, ticket4};
        Ticket[] actual = manager.searchAndSortBy("Сочи", "Москва", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }
}
