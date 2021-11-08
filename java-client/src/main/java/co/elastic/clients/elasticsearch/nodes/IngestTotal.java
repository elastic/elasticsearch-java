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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
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
public class IngestTotal implements JsonpSerializable {
	private final long count;

	private final long current;

	private final long failed;

	private final List<KeyedProcessor> processors;

	private final long timeInMillis;

	// ---------------------------------------------------------------------------------------------

	private IngestTotal(Builder builder) {

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.current = ModelTypeHelper.requireNonNull(builder.current, this, "current");
		this.failed = ModelTypeHelper.requireNonNull(builder.failed, this, "failed");
		this.processors = ModelTypeHelper.unmodifiableRequired(builder.processors, this, "processors");
		this.timeInMillis = ModelTypeHelper.requireNonNull(builder.timeInMillis, this, "timeInMillis");

	}

	public static IngestTotal of(Function<Builder, ObjectBuilder<IngestTotal>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code current}
	 */
	public final long current() {
		return this.current;
	}

	/**
	 * Required - API name: {@code failed}
	 */
	public final long failed() {
		return this.failed;
	}

	/**
	 * Required - API name: {@code processors}
	 */
	public final List<KeyedProcessor> processors() {
		return this.processors;
	}

	/**
	 * Required - API name: {@code time_in_millis}
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

		if (ModelTypeHelper.isDefined(this.processors)) {
			generator.writeKey("processors");
			generator.writeStartArray();
			for (KeyedProcessor item0 : this.processors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("time_in_millis");
		generator.write(this.timeInMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IngestTotal}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IngestTotal> {
		private Long count;

		private Long current;

		private Long failed;

		private List<KeyedProcessor> processors;

		private Long timeInMillis;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code current}
		 */
		public final Builder current(long value) {
			this.current = value;
			return this;
		}

		/**
		 * Required - API name: {@code failed}
		 */
		public final Builder failed(long value) {
			this.failed = value;
			return this;
		}

		/**
		 * Required - API name: {@code processors}
		 */
		public final Builder processors(List<KeyedProcessor> value) {
			this.processors = value;
			return this;
		}

		/**
		 * Required - API name: {@code processors}
		 */
		public final Builder processors(KeyedProcessor... value) {
			this.processors = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code processors}
		 */
		@SafeVarargs
		public final Builder processors(Function<KeyedProcessor.Builder, ObjectBuilder<KeyedProcessor>>... fns) {
			this.processors = new ArrayList<>(fns.length);
			for (Function<KeyedProcessor.Builder, ObjectBuilder<KeyedProcessor>> fn : fns) {
				this.processors.add(fn.apply(new KeyedProcessor.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code time_in_millis}
		 */
		public final Builder timeInMillis(long value) {
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
			_checkSingleUse();

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
