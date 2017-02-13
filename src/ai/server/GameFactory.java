/*******************
 * Christian A. Duncan
 * CSC350: Intelligent Systems
 * Spring 2017
 *
 * AI Game Server Project
 * This project is designed to support multiple game platforms to test
 * AI-based solutions.
 * See README file for more details.
 ********************/

package ai.server;

import ai.game.*;

/***********************************************************
 * An interface whose sole purpose is to create new games (of a specific type).
 ***********************************************************/
public interface GameFactory {
    public Game newGame();
}
