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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.PerPartitionCategorization

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.PerPartitionCategorization">API
 *      specification</a>
 */
@JsonpDeserializable
public class PerPartitionCategorization implements JsonpSerializable {
	@Nullable
	private final Boolean enabled;

	@Nullable
	private final Boolean stopOnWarn;

	// ---------------------------------------------------------------------------------------------

	private PerPartitionCategorization(Builder builder) {

		this.enabled = builder.enabled;
		this.stopOnWarn = builder.stopOnWarn;

	}

	public static PerPartitionCategorization of(Function<Builder, ObjectBuilder<PerPartitionCategorization>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * To enable this setting, you must also set the
	 * <code>partition_field_name</code> property to the same value in every
	 * detector that uses the keyword <code>mlcategory</code>. Otherwise, job
	 * creation fails.
	 * <p>
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * This setting can be set to true only if per-partition categorization is
	 * enabled. If true, both categorization and subsequent anomaly detection stops
	 * for partitions where the categorization status changes to warn. This setting
	 * makes it viable to have a job where it is expected that categorization works
	 * well for some partitions but not others; you do not pay the cost of bad
	 * categorization forever in the partitions where it works badly.
	 * <p>
	 * API name: {@code stop_on_warn}
	 */
	@Nullable
	public final Boolean stopOnWarn() {
		return this.stopOnWarn;
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

		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (this.stopOnWarn != null) {
			generator.writeKey("stop_on_warn");
			generator.write(this.stopOnWarn);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PerPartitionCategorization}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PerPartitionCategorization> {
		@Nullable
		private Boolean enabled;

		@Nullable
		private Boolean stopOnWarn;

		/**
		 * To enable this setting, you must also set the
		 * <code>partition_field_name</code> property to the same value in every
		 * detector that uses the keyword <code>mlcategory</code>. Otherwise, job
		 * creation fails.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * This setting can be set to true only if per-partition categorization is
		 * enabled. If true, both categorization and subsequent anomaly detection stops
		 * for partitions where the categorization status changes to warn. This setting
		 * makes it viable to have a job where it is expected that categorization works
		 * well for some partitions but not others; you do not pay the cost of bad
		 * categorization forever in the partitions where it works badly.
		 * <p>
		 * API name: {@code stop_on_warn}
		 */
		public final Builder stopOnWarn(@Nullable Boolean value) {
			this.stopOnWarn = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PerPartitionCategorization}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PerPartitionCategorization build() {
			_checkSingleUse();

			return new PerPartitionCategorization(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PerPartitionCategorization}
	 */
	public static final JsonpDeserializer<PerPartitionCategorization> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PerPartitionCategorization::setupPerPartitionCategorizationDeserializer);

	protected static void setupPerPartitionCategorizationDeserializer(
			ObjectDeserializer<PerPartitionCategorization.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::stopOnWarn, JsonpDeserializer.booleanDeserializer(), "stop_on_warn");

	}

}
