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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

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
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.IngestTotal

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.IngestTotal">API
 *      specification</a>
 */
@JsonpDeserializable
public class IngestTotal implements JsonpSerializable {
	@Nullable
	private final Long count;

	@Nullable
	private final Long current;

	@Nullable
	private final Long failed;

	private final List<Map<String, KeyedProcessor>> processors;

	@Nullable
	private final Long timeInMillis;

	// ---------------------------------------------------------------------------------------------

	private IngestTotal(Builder builder) {

		this.count = builder.count;
		this.current = builder.current;
		this.failed = builder.failed;
		this.processors = ApiTypeHelper.unmodifiable(builder.processors);
		this.timeInMillis = builder.timeInMillis;

	}

	public static IngestTotal of(Function<Builder, ObjectBuilder<IngestTotal>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code count}
	 */
	@Nullable
	public final Long count() {
		return this.count;
	}

	/**
	 * API name: {@code current}
	 */
	@Nullable
	public final Long current() {
		return this.current;
	}

	/**
	 * API name: {@code failed}
	 */
	@Nullable
	public final Long failed() {
		return this.failed;
	}

	/**
	 * API name: {@code processors}
	 */
	public final List<Map<String, KeyedProcessor>> processors() {
		return this.processors;
	}

	/**
	 * API name: {@code time_in_millis}
	 */
	@Nullable
	public final Long timeInMillis() {
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

		if (this.count != null) {
			generator.writeKey("count");
			generator.write(this.count);

		}
		if (this.current != null) {
			generator.writeKey("current");
			generator.write(this.current);

		}
		if (this.failed != null) {
			generator.writeKey("failed");
			generator.write(this.failed);

		}
		if (ApiTypeHelper.isDefined(this.processors)) {
			generator.writeKey("processors");
			generator.writeStartArray();
			for (Map<String, KeyedProcessor> item0 : this.processors) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, KeyedProcessor> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						item1.getValue().serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.timeInMillis != null) {
			generator.writeKey("time_in_millis");
			generator.write(this.timeInMillis);

		}

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
		@Nullable
		private Long count;

		@Nullable
		private Long current;

		@Nullable
		private Long failed;

		@Nullable
		private List<Map<String, KeyedProcessor>> processors;

		@Nullable
		private Long timeInMillis;

		/**
		 * API name: {@code count}
		 */
		public final Builder count(@Nullable Long value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code current}
		 */
		public final Builder current(@Nullable Long value) {
			this.current = value;
			return this;
		}

		/**
		 * API name: {@code failed}
		 */
		public final Builder failed(@Nullable Long value) {
			this.failed = value;
			return this;
		}

		/**
		 * API name: {@code processors}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>processors</code>.
		 */
		public final Builder processors(List<Map<String, KeyedProcessor>> list) {
			this.processors = _listAddAll(this.processors, list);
			return this;
		}

		/**
		 * API name: {@code processors}
		 * <p>
		 * Adds one or more values to <code>processors</code>.
		 */
		public final Builder processors(Map<String, KeyedProcessor> value, Map<String, KeyedProcessor>... values) {
			this.processors = _listAdd(this.processors, value, values);
			return this;
		}

		/**
		 * API name: {@code time_in_millis}
		 */
		public final Builder timeInMillis(@Nullable Long value) {
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
		op.add(Builder::processors, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.stringMapDeserializer(KeyedProcessor._DESERIALIZER)), "processors");
		op.add(Builder::timeInMillis, JsonpDeserializer.longDeserializer(), "time_in_millis");

	}

}
