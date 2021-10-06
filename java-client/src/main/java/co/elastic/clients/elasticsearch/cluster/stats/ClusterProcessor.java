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

package co.elastic.clients.elasticsearch.cluster.stats;

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
import java.util.Objects;
import java.util.function.Function;

// typedef: cluster.stats.ClusterProcessor
@JsonpDeserializable
public final class ClusterProcessor implements JsonpSerializable {
	private final long count;

	private final long current;

	private final long failed;

	private final long timeInMillis;

	// ---------------------------------------------------------------------------------------------

	public ClusterProcessor(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.current = Objects.requireNonNull(builder.current, "current");
		this.failed = Objects.requireNonNull(builder.failed, "failed");
		this.timeInMillis = Objects.requireNonNull(builder.timeInMillis, "time_in_millis");

	}

	public ClusterProcessor(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code count}
	 */
	public long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code current}
	 */
	public long current() {
		return this.current;
	}

	/**
	 * Required - API name: {@code failed}
	 */
	public long failed() {
		return this.failed;
	}

	/**
	 * Required - API name: {@code time_in_millis}
	 */
	public long timeInMillis() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterProcessor}.
	 */
	public static class Builder implements ObjectBuilder<ClusterProcessor> {
		private Long count;

		private Long current;

		private Long failed;

		private Long timeInMillis;

		/**
		 * Required - API name: {@code count}
		 */
		public Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code current}
		 */
		public Builder current(long value) {
			this.current = value;
			return this;
		}

		/**
		 * Required - API name: {@code failed}
		 */
		public Builder failed(long value) {
			this.failed = value;
			return this;
		}

		/**
		 * Required - API name: {@code time_in_millis}
		 */
		public Builder timeInMillis(long value) {
			this.timeInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterProcessor build() {

			return new ClusterProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterProcessor}
	 */
	public static final JsonpDeserializer<ClusterProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ClusterProcessor::setupClusterProcessorDeserializer, Builder::build);

	protected static void setupClusterProcessorDeserializer(DelegatingDeserializer<ClusterProcessor.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::current, JsonpDeserializer.longDeserializer(), "current");
		op.add(Builder::failed, JsonpDeserializer.longDeserializer(), "failed");
		op.add(Builder::timeInMillis, JsonpDeserializer.longDeserializer(), "time_in_millis");

	}

}
