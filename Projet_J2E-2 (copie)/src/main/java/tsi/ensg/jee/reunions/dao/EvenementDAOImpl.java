package tsi.ensg.jee.reunions.dao;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import tsi.ensg.jee.reunions.model.Evenement;
import tsi.ensg.jee.reunions.model.Participant;

import java.util.List;
import java.util.Optional;

public class EvenementDAOImpl implements EvenementDAO{

    @Override
    public List<Evenement> findAll() {
        return null;
    }

    @Override
    public List<Evenement> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Evenement> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Evenement> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Evenement evenement) {

    }

    @Override
    public void deleteAll(Iterable<? extends Evenement> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Evenement> S save(S s) {
        return null;
    }

    @Override
    public <S extends Evenement> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Evenement> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Evenement> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Evenement> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Evenement getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Evenement> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Evenement> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Evenement> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Evenement> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Evenement> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Evenement> boolean exists(Example<S> example) {
        return false;
    }
}
