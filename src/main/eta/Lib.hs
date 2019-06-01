module Lib where

import Java

foreign export java "@static io.github.rinx.etaexportmethodsample.Numbers.zero" zero :: IO Int
zero = do
  putStrLn "Returning zero from eta"
  return 0

foreign export java "@static io.github.rinx.etaexportmethodsample.Numbers.one" one :: Int
one = 1

foreign export java "@static io.github.rinx.etaexportmethodsample.Numbers.addTwo" addTwo :: Int -> Java a Int
addTwo x = return $ x + 2

foreign export java "@static io.github.rinx.etaexportmethodsample.Arrays.mapProd" mapProd :: Int -> JIntArray -> IO JIntArray
mapProd n xs = java $ do
  xs' <- xs <.> arrayToList
  arrayFromList $ map (* n) xs'
