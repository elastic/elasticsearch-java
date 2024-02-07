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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
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

// typedef: nodes._types.CpuAcct

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.CpuAcct">API
 *      specification</a>
 */
@JsonpDeserializable
public class CpuAcct implements JsonpSerializable {
	@Nullable
	private final String controlGroup;

	@Nullable
	private final Long usageNanos;

	// ---------------------------------------------------------------------------------------------

	private CpuAcct(Builder builder) {

		this.controlGroup = builder.controlGroup;
		this.usageNanos = builder.usageNanos;

	}

	public static CpuAcct of(Function<Builder, ObjectBuilder<CpuAcct>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The <code>cpuacct</code> control group to which the Elasticsearch process
	 * belongs.
	 * <p>
	 * API name: {@code control_group}
	 */
	@Nullable
	public final String controlGroup() {
		return this.controlGroup;
	}

	/**
	 * The total CPU time, in nanoseconds, consumed by all tasks in the same cgroup
	 * as the Elasticsearch process.
	 * <p>
	 * API name: {@code usage_nanos}
	 */
	@Nullable
	public final Long usageNanos() {
		return this.usageNanos;
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

		if (this.controlGroup != null) {
			generator.writeKey("control_group");
			generator.write(this.controlGroup);

		}
		if (this.usageNanos != null) {
			generator.writeKey("usage_nanos");
			generator.write(this.usageNanos);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CpuAcct}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CpuAcct> {
		@Nullable
		private String controlGroup;

		@Nullable
		private Long usageNanos;

		/**
		 * The <code>cpuacct</code> control group to which the Elasticsearch process
		 * belongs.
		 * <p>
		 * API name: {@code control_group}
		 */
		public final Builder controlGroup(@Nullable String value) {
			this.controlGroup = value;
			return this;
		}

		/**
		 * The total CPU time, in nanoseconds, consumed by all tasks in the same cgroup
		 * as the Elasticsearch process.
		 * <p>
		 * API name: {@code usage_nanos}
		 */
		public final Builder usageNanos(@Nullable Long value) {
			this.usageNanos = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CpuAcct}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CpuAcct build() {
			_checkSingleUse();

			return new CpuAcct(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CpuAcct}
	 */
	public static final JsonpDeserializer<CpuAcct> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CpuAcct::setupCpuAcctDeserializer);

	protected static void setupCpuAcctDeserializer(ObjectDeserializer<CpuAcct.Builder> op) {

		op.add(Builder::controlGroup, JsonpDeserializer.stringDeserializer(), "control_group");
		op.add(Builder::usageNanos, JsonpDeserializer.longDeserializer(), "usage_nanos");

	}

}
