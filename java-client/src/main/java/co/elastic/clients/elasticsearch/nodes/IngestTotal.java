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

package co.elastic.clients.elasticsearch.nodes;

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

// typedef: nodes._types.IngestTotal

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.IngestTotal">API
 *      specification</a>
 */
@JsonpDeserializable
public class IngestTotal implements JsonpSerializable {
	private final long count;

	private final long current;

	private final long failed;

	private final long timeInMillis;

	// ---------------------------------------------------------------------------------------------

	private IngestTotal(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.current = ApiTypeHelper.requireNonNull(builder.current, this, "current");
		this.failed = ApiTypeHelper.requireNonNull(builder.failed, this, "failed");
		this.timeInMillis = ApiTypeHelper.requireNonNull(builder.timeInMillis, this, "timeInMillis");

	}

	public static IngestTotal of(Function<Builder, ObjectBuilder<IngestTotal>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Total number of documents ingested during the lifetime of this
	 * node.
	 * <p>
	 * API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - Total number of documents currently being ingested.
	 * <p>
	 * API name: {@code current}
	 */
	public final long current() {
		return this.current;
	}

	/**
	 * Required - Total number of failed ingest operations during the lifetime of
	 * this node.
	 * <p>
	 * API name: {@code failed}
	 */
	public final long failed() {
		return this.failed;
	}

	/**
	 * Required - Total time, in milliseconds, spent preprocessing ingest documents
	 * during the lifetime of this node.
	 * <p>
	 * API name: {@code time_in_millis}
	 */
	public final long timeInMillis() {
		return this.timeInMillis;
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("current");
		generator.write(this.current);

		generator.writeKey("failed");
		generator.write(this.failed);

		generator.writeKey("time_in_millis");
		generator.write(this.timeInMillis);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IngestTotal}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IngestTotal> {
		private Long count;

		private Long current;

		private Long failed;

		private Long timeInMillis;

		/**
		 * Required - Total number of documents ingested during the lifetime of this
		 * node.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - Total number of documents currently being ingested.
		 * <p>
		 * API name: {@code current}
		 */
		public final Builder current(long value) {
			this.current = value;
			return this;
		}

		/**
		 * Required - Total number of failed ingest operations during the lifetime of
		 * this node.
		 * <p>
		 * API name: {@code failed}
		 */
		public final Builder failed(long value) {
			this.failed = value;
			return this;
		}

		/**
		 * Required - Total time, in milliseconds, spent preprocessing ingest documents
		 * during the lifetime of this node.
		 * <p>
		 * API name: {@code time_in_millis}
		 */
		public final Builder timeInMillis(long value) {
			this.timeInMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IngestTotal}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IngestTotal build() {
			_checkSingleUse();

			return new IngestTotal(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IngestTotal}
	 */
	public static final JsonpDeserializer<IngestTotal> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IngestTotal::setupIngestTotalDeserializer);

	protected static void setupIngestTotalDeserializer(ObjectDeserializer<IngestTotal.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::current, JsonpDeserializer.longDeserializer(), "current");
		op.add(Builder::failed, JsonpDeserializer.longDeserializer(), "failed");
		op.add(Builder::timeInMillis, JsonpDeserializer.longDeserializer(), "time_in_millis");

	}

}
