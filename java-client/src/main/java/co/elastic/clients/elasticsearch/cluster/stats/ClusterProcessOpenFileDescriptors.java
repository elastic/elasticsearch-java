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

// typedef: cluster.stats.ClusterProcessOpenFileDescriptors
@JsonpDeserializable
public final class ClusterProcessOpenFileDescriptors implements JsonpSerializable {
	private final long avg;

	private final long max;

	private final long min;

	// ---------------------------------------------------------------------------------------------

	public ClusterProcessOpenFileDescriptors(Builder builder) {

		this.avg = Objects.requireNonNull(builder.avg, "avg");
		this.max = Objects.requireNonNull(builder.max, "max");
		this.min = Objects.requireNonNull(builder.min, "min");

	}

	public ClusterProcessOpenFileDescriptors(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code avg}
	 */
	public long avg() {
		return this.avg;
	}

	/**
	 * Required - API name: {@code max}
	 */
	public long max() {
		return this.max;
	}

	/**
	 * Required - API name: {@code min}
	 */
	public long min() {
		return this.min;
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

		generator.writeKey("avg");
		generator.write(this.avg);

		generator.writeKey("max");
		generator.write(this.max);

		generator.writeKey("min");
		generator.write(this.min);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterProcessOpenFileDescriptors}.
	 */
	public static class Builder implements ObjectBuilder<ClusterProcessOpenFileDescriptors> {
		private Long avg;

		private Long max;

		private Long min;

		/**
		 * Required - API name: {@code avg}
		 */
		public Builder avg(long value) {
			this.avg = value;
			return this;
		}

		/**
		 * Required - API name: {@code max}
		 */
		public Builder max(long value) {
			this.max = value;
			return this;
		}

		/**
		 * Required - API name: {@code min}
		 */
		public Builder min(long value) {
			this.min = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterProcessOpenFileDescriptors}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterProcessOpenFileDescriptors build() {

			return new ClusterProcessOpenFileDescriptors(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterProcessOpenFileDescriptors}
	 */
	public static final JsonpDeserializer<ClusterProcessOpenFileDescriptors> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterProcessOpenFileDescriptors::setupClusterProcessOpenFileDescriptorsDeserializer,
					Builder::build);

	protected static void setupClusterProcessOpenFileDescriptorsDeserializer(
			DelegatingDeserializer<ClusterProcessOpenFileDescriptors.Builder> op) {

		op.add(Builder::avg, JsonpDeserializer.longDeserializer(), "avg");
		op.add(Builder::max, JsonpDeserializer.longDeserializer(), "max");
		op.add(Builder::min, JsonpDeserializer.longDeserializer(), "min");

	}

}
