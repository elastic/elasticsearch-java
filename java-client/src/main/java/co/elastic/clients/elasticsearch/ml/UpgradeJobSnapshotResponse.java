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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.upgrade_job_snapshot.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.upgrade_job_snapshot.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpgradeJobSnapshotResponse implements JsonpSerializable {
	private final String node;

	private final boolean completed;

	// ---------------------------------------------------------------------------------------------

	private UpgradeJobSnapshotResponse(Builder builder) {

		this.node = ApiTypeHelper.requireNonNull(builder.node, this, "node");
		this.completed = ApiTypeHelper.requireNonNull(builder.completed, this, "completed");

	}

	public static UpgradeJobSnapshotResponse of(Function<Builder, ObjectBuilder<UpgradeJobSnapshotResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The ID of the node that the upgrade task was started on if it is
	 * still running. In serverless this will be the &quot;serverless&quot;.
	 * <p>
	 * API name: {@code node}
	 */
	public final String node() {
		return this.node;
	}

	/**
	 * Required - When true, this means the task is complete. When false, it is
	 * still running.
	 * <p>
	 * API name: {@code completed}
	 */
	public final boolean completed() {
		return this.completed;
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

		generator.writeKey("node");
		generator.write(this.node);

		generator.writeKey("completed");
		generator.write(this.completed);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpgradeJobSnapshotResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<UpgradeJobSnapshotResponse> {
		private String node;

		private Boolean completed;

		/**
		 * Required - The ID of the node that the upgrade task was started on if it is
		 * still running. In serverless this will be the &quot;serverless&quot;.
		 * <p>
		 * API name: {@code node}
		 */
		public final Builder node(String value) {
			this.node = value;
			return this;
		}

		/**
		 * Required - When true, this means the task is complete. When false, it is
		 * still running.
		 * <p>
		 * API name: {@code completed}
		 */
		public final Builder completed(boolean value) {
			this.completed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpgradeJobSnapshotResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpgradeJobSnapshotResponse build() {
			_checkSingleUse();

			return new UpgradeJobSnapshotResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpgradeJobSnapshotResponse}
	 */
	public static final JsonpDeserializer<UpgradeJobSnapshotResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpgradeJobSnapshotResponse::setupUpgradeJobSnapshotResponseDeserializer);

	protected static void setupUpgradeJobSnapshotResponseDeserializer(
			ObjectDeserializer<UpgradeJobSnapshotResponse.Builder> op) {

		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::completed, JsonpDeserializer.booleanDeserializer(), "completed");

	}

}
