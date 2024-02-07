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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: _types.aggregations.TermsPartition

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.TermsPartition">API
 *      specification</a>
 */
@JsonpDeserializable
public class TermsPartition implements JsonpSerializable {
	private final long numPartitions;

	private final long partition;

	// ---------------------------------------------------------------------------------------------

	private TermsPartition(Builder builder) {

		this.numPartitions = ApiTypeHelper.requireNonNull(builder.numPartitions, this, "numPartitions");
		this.partition = ApiTypeHelper.requireNonNull(builder.partition, this, "partition");

	}

	public static TermsPartition of(Function<Builder, ObjectBuilder<TermsPartition>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The number of partitions.
	 * <p>
	 * API name: {@code num_partitions}
	 */
	public final long numPartitions() {
		return this.numPartitions;
	}

	/**
	 * Required - The partition number for this request.
	 * <p>
	 * API name: {@code partition}
	 */
	public final long partition() {
		return this.partition;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("num_partitions");
		generator.write(this.numPartitions);

		generator.writeKey("partition");
		generator.write(this.partition);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermsPartition}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TermsPartition> {
		private Long numPartitions;

		private Long partition;

		/**
		 * Required - The number of partitions.
		 * <p>
		 * API name: {@code num_partitions}
		 */
		public final Builder numPartitions(long value) {
			this.numPartitions = value;
			return this;
		}

		/**
		 * Required - The partition number for this request.
		 * <p>
		 * API name: {@code partition}
		 */
		public final Builder partition(long value) {
			this.partition = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TermsPartition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermsPartition build() {
			_checkSingleUse();

			return new TermsPartition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermsPartition}
	 */
	public static final JsonpDeserializer<TermsPartition> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TermsPartition::setupTermsPartitionDeserializer);

	protected static void setupTermsPartitionDeserializer(ObjectDeserializer<TermsPartition.Builder> op) {

		op.add(Builder::numPartitions, JsonpDeserializer.longDeserializer(), "num_partitions");
		op.add(Builder::partition, JsonpDeserializer.longDeserializer(), "partition");

	}

}
