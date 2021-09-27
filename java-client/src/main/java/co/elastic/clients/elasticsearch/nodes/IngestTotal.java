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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.IngestTotal
@JsonpDeserializable
public final class IngestTotal implements JsonpSerializable {
	private final Long count;

	private final Long current;

	private final Long failed;

	private final List<KeyedProcessor> processors;

	private final Long timeInMillis;

	// ---------------------------------------------------------------------------------------------

	public IngestTotal(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.current = Objects.requireNonNull(builder.current, "current");
		this.failed = Objects.requireNonNull(builder.failed, "failed");
		this.processors = Objects.requireNonNull(builder.processors, "processors");
		this.timeInMillis = Objects.requireNonNull(builder.timeInMillis, "time_in_millis");

	}

	/**
	 * API name: {@code count}
	 */
	public Long count() {
		return this.count;
	}

	/**
	 * API name: {@code current}
	 */
	public Long current() {
		return this.current;
	}

	/**
	 * API name: {@code failed}
	 */
	public Long failed() {
		return this.failed;
	}

	/**
	 * API name: {@code processors}
	 */
	public List<KeyedProcessor> processors() {
		return this.processors;
	}

	/**
	 * API name: {@code time_in_millis}
	 */
	public Long timeInMillis() {
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

		generator.writeKey("processors");
		generator.writeStartArray();
		for (KeyedProcessor item0 : this.processors) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("time_in_millis");
		generator.write(this.timeInMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IngestTotal}.
	 */
	public static class Builder implements ObjectBuilder<IngestTotal> {
		private Long count;

		private Long current;

		private Long failed;

		private List<KeyedProcessor> processors;

		private Long timeInMillis;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Long value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code current}
		 */
		public Builder current(Long value) {
			this.current = value;
			return this;
		}

		/**
		 * API name: {@code failed}
		 */
		public Builder failed(Long value) {
			this.failed = value;
			return this;
		}

		/**
		 * API name: {@code processors}
		 */
		public Builder processors(List<KeyedProcessor> value) {
			this.processors = value;
			return this;
		}

		/**
		 * API name: {@code processors}
		 */
		public Builder processors(KeyedProcessor... value) {
			this.processors = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #processors(List)}, creating the list if needed.
		 */
		public Builder addProcessors(KeyedProcessor value) {
			if (this.processors == null) {
				this.processors = new ArrayList<>();
			}
			this.processors.add(value);
			return this;
		}

		/**
		 * Set {@link #processors(List)} to a singleton list.
		 */
		public Builder processors(Function<KeyedProcessor.Builder, ObjectBuilder<KeyedProcessor>> fn) {
			return this.processors(fn.apply(new KeyedProcessor.Builder()).build());
		}

		/**
		 * Add a value to {@link #processors(List)}, creating the list if needed.
		 */
		public Builder addProcessors(Function<KeyedProcessor.Builder, ObjectBuilder<KeyedProcessor>> fn) {
			return this.addProcessors(fn.apply(new KeyedProcessor.Builder()).build());
		}

		/**
		 * API name: {@code time_in_millis}
		 */
		public Builder timeInMillis(Long value) {
			this.timeInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link IngestTotal}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IngestTotal build() {

			return new IngestTotal(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IngestTotal}
	 */
	public static final JsonpDeserializer<IngestTotal> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IngestTotal::setupIngestTotalDeserializer, Builder::build);

	protected static void setupIngestTotalDeserializer(DelegatingDeserializer<IngestTotal.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::current, JsonpDeserializer.longDeserializer(), "current");
		op.add(Builder::failed, JsonpDeserializer.longDeserializer(), "failed");
		op.add(Builder::processors, JsonpDeserializer.arrayDeserializer(KeyedProcessor._DESERIALIZER), "processors");
		op.add(Builder::timeInMillis, JsonpDeserializer.longDeserializer(), "time_in_millis");

	}

}
