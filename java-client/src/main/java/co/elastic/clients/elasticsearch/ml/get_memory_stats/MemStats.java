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

package co.elastic.clients.elasticsearch.ml.get_memory_stats;

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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_memory_stats.MemStats

/**
 *
 * @see <a href="../../doc-files/api-spec.html#ml.get_memory_stats.MemStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class MemStats implements JsonpSerializable {
	@Nullable
	private final String adjustedTotal;

	private final int adjustedTotalInBytes;

	@Nullable
	private final String total;

	private final int totalInBytes;

	private final MemMlStats ml;

	// ---------------------------------------------------------------------------------------------

	private MemStats(Builder builder) {

		this.adjustedTotal = builder.adjustedTotal;
		this.adjustedTotalInBytes = ApiTypeHelper.requireNonNull(builder.adjustedTotalInBytes, this,
				"adjustedTotalInBytes");
		this.total = builder.total;
		this.totalInBytes = ApiTypeHelper.requireNonNull(builder.totalInBytes, this, "totalInBytes");
		this.ml = ApiTypeHelper.requireNonNull(builder.ml, this, "ml");

	}

	public static MemStats of(Function<Builder, ObjectBuilder<MemStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If the amount of physical memory has been overridden using the
	 * es.total_memory_bytes system property then this reports the overridden value.
	 * Otherwise it reports the same value as total.
	 * <p>
	 * API name: {@code adjusted_total}
	 */
	@Nullable
	public final String adjustedTotal() {
		return this.adjustedTotal;
	}

	/**
	 * Required - If the amount of physical memory has been overridden using the
	 * <code>es.total_memory_bytes</code> system property then this reports the
	 * overridden value in bytes. Otherwise it reports the same value as
	 * <code>total_in_bytes</code>.
	 * <p>
	 * API name: {@code adjusted_total_in_bytes}
	 */
	public final int adjustedTotalInBytes() {
		return this.adjustedTotalInBytes;
	}

	/**
	 * Total amount of physical memory.
	 * <p>
	 * API name: {@code total}
	 */
	@Nullable
	public final String total() {
		return this.total;
	}

	/**
	 * Required - Total amount of physical memory in bytes.
	 * <p>
	 * API name: {@code total_in_bytes}
	 */
	public final int totalInBytes() {
		return this.totalInBytes;
	}

	/**
	 * Required - Contains statistics about machine learning use of native memory on
	 * the node.
	 * <p>
	 * API name: {@code ml}
	 */
	public final MemMlStats ml() {
		return this.ml;
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

		if (this.adjustedTotal != null) {
			generator.writeKey("adjusted_total");
			generator.write(this.adjustedTotal);

		}
		generator.writeKey("adjusted_total_in_bytes");
		generator.write(this.adjustedTotalInBytes);

		if (this.total != null) {
			generator.writeKey("total");
			generator.write(this.total);

		}
		generator.writeKey("total_in_bytes");
		generator.write(this.totalInBytes);

		generator.writeKey("ml");
		this.ml.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MemStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<MemStats> {
		@Nullable
		private String adjustedTotal;

		private Integer adjustedTotalInBytes;

		@Nullable
		private String total;

		private Integer totalInBytes;

		private MemMlStats ml;

		/**
		 * If the amount of physical memory has been overridden using the
		 * es.total_memory_bytes system property then this reports the overridden value.
		 * Otherwise it reports the same value as total.
		 * <p>
		 * API name: {@code adjusted_total}
		 */
		public final Builder adjustedTotal(@Nullable String value) {
			this.adjustedTotal = value;
			return this;
		}

		/**
		 * Required - If the amount of physical memory has been overridden using the
		 * <code>es.total_memory_bytes</code> system property then this reports the
		 * overridden value in bytes. Otherwise it reports the same value as
		 * <code>total_in_bytes</code>.
		 * <p>
		 * API name: {@code adjusted_total_in_bytes}
		 */
		public final Builder adjustedTotalInBytes(int value) {
			this.adjustedTotalInBytes = value;
			return this;
		}

		/**
		 * Total amount of physical memory.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable String value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - Total amount of physical memory in bytes.
		 * <p>
		 * API name: {@code total_in_bytes}
		 */
		public final Builder totalInBytes(int value) {
			this.totalInBytes = value;
			return this;
		}

		/**
		 * Required - Contains statistics about machine learning use of native memory on
		 * the node.
		 * <p>
		 * API name: {@code ml}
		 */
		public final Builder ml(MemMlStats value) {
			this.ml = value;
			return this;
		}

		/**
		 * Required - Contains statistics about machine learning use of native memory on
		 * the node.
		 * <p>
		 * API name: {@code ml}
		 */
		public final Builder ml(Function<MemMlStats.Builder, ObjectBuilder<MemMlStats>> fn) {
			return this.ml(fn.apply(new MemMlStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MemStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MemStats build() {
			_checkSingleUse();

			return new MemStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MemStats}
	 */
	public static final JsonpDeserializer<MemStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MemStats::setupMemStatsDeserializer);

	protected static void setupMemStatsDeserializer(ObjectDeserializer<MemStats.Builder> op) {

		op.add(Builder::adjustedTotal, JsonpDeserializer.stringDeserializer(), "adjusted_total");
		op.add(Builder::adjustedTotalInBytes, JsonpDeserializer.integerDeserializer(), "adjusted_total_in_bytes");
		op.add(Builder::total, JsonpDeserializer.stringDeserializer(), "total");
		op.add(Builder::totalInBytes, JsonpDeserializer.integerDeserializer(), "total_in_bytes");
		op.add(Builder::ml, MemMlStats._DESERIALIZER, "ml");

	}

}
