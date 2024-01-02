import matplotlib.pyplot as plt
import pandas as pd


def create_graphs():
    binary_search_operations_number_data = pd.read_csv('binary-search_operations-number.csv')
    binary_search_operations_number_data_x = binary_search_operations_number_data['Data set size']
    binary_search_operations_number_data_y = binary_search_operations_number_data['Operations number']
    plt.plot(binary_search_operations_number_data_x, binary_search_operations_number_data_y,
             label='Binary search operations number relative to data size')
    plt.xlabel('Data set size')
    plt.ylabel('Operations number')
    plt.title('Binary search operations number relative to data size')
    plt.legend()
    plt.savefig('binary-search_operations-number.png')
    plt.show()

    binary_search_execution_time_data = pd.read_csv('binary-search_execution-time.csv')
    binary_search_execution_time_data_x = binary_search_execution_time_data['Data set size']
    binary_search_execution_time_data_y = binary_search_execution_time_data['Execution time']
    plt.plot(binary_search_execution_time_data_x, binary_search_execution_time_data_y,
             label='Binary search execution time relative to data size')
    plt.xlabel('Data set size')
    plt.ylabel('Operations number')
    plt.title('Binary search execution time relative to data size')
    plt.legend()
    plt.savefig('binary-search_execution-time.png')
    plt.show()

    linear_search_operations_number_data = pd.read_csv('linear-search_operations-number.csv')
    linear_search_operations_number_data_x = linear_search_operations_number_data['Data set size']
    linear_search_operations_number_data_y = linear_search_operations_number_data['Operations number']
    plt.plot(linear_search_operations_number_data_x, linear_search_operations_number_data_y,
             label='Linear search operations number relative to data size')
    plt.xlabel('Data set size')
    plt.ylabel('Operations number')
    plt.title('Linear search operations number relative to data size')
    plt.legend()
    plt.savefig('linear-search_operations-number.png')
    plt.show()

    linear_search_execution_time_data = pd.read_csv('linear-search_execution-time.csv')
    linear_search_execution_time_data_x = linear_search_execution_time_data['Data set size']
    linear_search_execution_time_data_y = linear_search_execution_time_data['Execution time']
    plt.plot(linear_search_execution_time_data_x, linear_search_execution_time_data_y,
             label='Linear search execution time relative to data size')
    plt.xlabel('Data set size')
    plt.ylabel('Operations number')
    plt.title('Linear search execution time relative to data size')
    plt.legend()
    plt.savefig('linear-search_execution-time.png')
    plt.show()

    selection_sort_operations_number_data = pd.read_csv('selection-sort_operations-number.csv')
    selection_sort_operations_number_data_x = selection_sort_operations_number_data['Data set size']
    selection_sort_operations_number_data_y = selection_sort_operations_number_data['Operations number']
    plt.plot(selection_sort_operations_number_data_x, selection_sort_operations_number_data_y,
             label='Selection sort operations number relative to data size')
    plt.xlabel('Data set size')
    plt.ylabel('Operations number')
    plt.title('Selection sort operations number relative to data size')
    plt.legend()
    plt.savefig('selection-sort_operations-number.png')
    plt.show()

    selection_sort_execution_time_data = pd.read_csv('selection-sort_execution-time.csv')
    selection_sort_execution_time_data_x = selection_sort_execution_time_data['Data set size']
    selection_sort_execution_time_data_y = selection_sort_execution_time_data['Execution time']
    plt.plot(linear_search_execution_time_data_x, linear_search_execution_time_data_y,
             label='Selection sort execution time relative to data size')
    plt.xlabel('Data set size')
    plt.ylabel('Operations number')
    plt.title('Selection sort execution time relative to data size')
    plt.legend()
    plt.savefig('selection-sort_execution-time.png')
    plt.show()

    cubic_operations_number_data = pd.read_csv('cubic_operations-number.csv')
    cubic_operations_number_data_x = cubic_operations_number_data['Data set size']
    cubic_operations_number_data_y = cubic_operations_number_data['Operations number']
    plt.plot(cubic_operations_number_data_x, cubic_operations_number_data_y,
             label='Cubic operations number relative to data size')
    plt.xlabel('Data set size')
    plt.ylabel('Operations number')
    plt.title('Cubic operations number relative to data size')
    plt.legend()
    plt.savefig('cubic_operations-number.png')
    plt.show()

    cubic_operations_number_data = pd.read_csv('cubic_execution-time.csv')
    cubic_operations_number_data_x = cubic_operations_number_data['Data set size']
    cubic_operations_number_data_y = cubic_operations_number_data['Execution time']
    plt.plot(cubic_operations_number_data_x, cubic_operations_number_data_y,
             label='Cubic execution time relative to data size')
    plt.xlabel('Data set size')
    plt.ylabel('Operations number')
    plt.title('Cubic execution time relative to data size')
    plt.legend()
    plt.savefig('cubic_execution-time.png')
    plt.show()


if __name__ == '__main__':
    create_graphs()

