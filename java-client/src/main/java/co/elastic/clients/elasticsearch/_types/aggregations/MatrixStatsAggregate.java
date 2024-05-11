/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _types.aggregations.MatrixStatsAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.MatrixStatsAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class MatrixStatsAggregate extends AggregateBase implements AggregateVariant {
	private final long docCount;

	private final List<MatrixStatsFields> fields;

	// ---------------------------------------------------------------------------------------------

	private MatrixStatsAggregate(Builder builder) {
		super(builder);

		this.docCount = ApiTypeHelper.requireNonNull(builder.docCount, this, "docCount");
		this.fields = ApiTypeHelper.unmodifiableRequired(builder.fields, this, "fields");

	}

	public static MatrixStatsAggregate of(Function<Builder, ObjectBuilder<MatrixStatsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.MatrixStats;
	}

	/**
	 * Required - API name: {@code doc_count}
	 */
	public final long docCount() {
		return this.docCount;
	}

	/**
	 * Required - API name: {@code fields}
	 */
	public final List<MatrixStatsFields> fields() {
		return this.fields;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("doc_count");
		generator.write(this.docCount);

		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (MatrixStatsFields item0 : this.fields) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MatrixStatsAggregate}.
	 */

	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MatrixStatsAggregate> {
		private Long docCount;

		private List<MatrixStatsFields> fields;

		/**
		 * Required - API name: {@code doc_count}
		 */
		public final Builder docCount(long value) {
			this.docCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<MatrixStatsFields> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(MatrixStatsFields value, MatrixStatsFields... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 * <p>
		 * Adds a value to <code>fields</code> using a builder lambda.
		 */
		public final Builder fields(Function<MatrixStatsFields.Builder, ObjectBuilder<MatrixStatsFields>> fn) {
			return fields(fn.apply(new MatrixStatsFields.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MatrixStatsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatrixStatsAggregate build() {
			_checkSingleUse();

			return new MatrixStatsAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MatrixStatsAggregate}
	 */
	public static final JsonpDeserializer<MatrixStatsAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MatrixStatsAggregate::setupMatrixStatsAggregateDeserializer);

	protected static void setupMatrixStatsAggregateDeserializer(ObjectDeserializer<MatrixStatsAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::docCount, JsonpDeserializer.longDeserializer(), "doc_count");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(MatrixStatsFields._DESERIALIZER), "fields");

	}

}
